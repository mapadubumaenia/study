<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 	부트스트랩 css  -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <!-- 	개발자 css -->
    <link rel="stylesheet" href="/css/style.css">

</head>
<body>
<jsp:include page="/common/header.jsp"></jsp:include>
${emps} : 데이터 배열 <br>
${pages.totalPages} : 총페이지 수 <br>
${pages.number} : 현재페이지번호 <br>
${pages.size} : 화면에 보일 개수 <br>
<div class="page mt3">
    <form id="listForm" name="listForm" method="get">
        <%--     TODO: 컨트롤러로 page(현재페이지번호) 값 전송    --%>
        <input type="hidden" id="page" name="page" value="0">

        <%--     퀴즈: 검색기능 넣기(부서 참고)   --%>
        <div class="input-group mb3 mt3">
            <input type="text"
                   class="form-control"
                   id="searchKeyword"
                   name="searchKeyword"
                   placeholder="사원명입력"
                   value="${param.searchKeyword}"
            >
            <button class="btn btn-primary"
                    type="button"
                    onclick="fn_egov_link_page(0)"
            >
                검색
            </button>
        </div>
        <div id="result"></div>
        <table class="table">
            <thead>
            <tr>
                <th scope="col">eno</th>
                <th scope="col">ename</th>
                <th scope="col">job</th>
                <th scope="col">manager</th>
                <th scope="col">hiredate</th>
                <th scope="col">salary</th>
                <th scope="col">commission</th>
                <th scope="col">dno</th>
            </tr>
            </thead>
            <tbody>
            <!-- 반복문 -->
            <c:forEach var="data" items="${emps}">
                <tr>
                    <td>
                        <a href="/emp/edition?eno=${data.eno}">
                            <c:out value="${data.eno}"></c:out>
                        </a>
                    </td>
                    <td><c:out value="${data.ename}"></c:out></td>
                    <td><c:out value="${data.job}"></c:out></td>
                    <td><c:out value="${data.manager}"></c:out></td>
                    <td><c:out value="${data.hiredate}"></c:out></td>
                    <td><c:out value="${data.salary}"></c:out></td>
                    <td><c:out value="${data.commission}"></c:out></td>
                    <td><c:out value="${data.dno}"></c:out></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <%--          만약 결과가 없으면 없습니다 화면 표시  --%>
        <c:if test="${empty depts}">
            데이터가 없습니다.
        </c:if>
        <!-- 페이지 번호 태그 -->
        <ul class="pagination" id="pagination"></ul>
    </form>

</div>
<!-- jquery -->
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<!-- 부트스트랩 js -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>

<script>
    <%--  주석: ctrl + /  --%>
    <%--  전체조회  --%>

    function fn_egov_link_page(page) {
        $("#page").val(page);        // input 태그 id=page 이 값이 컨트롤러로 전송됨
        // 의미: listForm 태그를 선택해서 속성 action 값을 /emp 변경
        $("#listForm").attr("action", "/emp")
            .submit();               // 이 때 컨트롤로로 값이 전송됨
    }
</script>

<%-- 퀴즈: 사원에 페이지번호 넣기 --%>
<!-- 페이징 라이브러리 -->
<script src="/js/jquery.twbsPagination.js" type="text/javascript"></script>

<script type="text/javascript">
    /* 페이징 처리 */
    $('#pagination').twbsPagination({
        totalPages: ${pages.totalPages}, // 총페이지수
        startPage:  ${pages.number+1},   // 첫페이지번호(벡엔드: 0, 프론트: 1)
        visiblePages: ${pages.size},     // 화면에 보일 개수
        initiateStartPageClick: false,
        onPageClick: function (event, page) {  // page(프론트의 현재페이지번호)
            /* 재조회 함수 실행: 벡엔드로 전송(page-1해서) */
            fn_egov_link_page(page - 1)
        }
    });
</script>


<jsp:include page="/common/footer.jsp"></jsp:include>
</body>
</html>
