<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Faq</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!--    부트스트랩 css  -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <!--    개발자 css -->
    <link rel="stylesheet" href="/css/style.css">

</head>
<body>
<%-- 주석단축키: ctrl+/ --%>
<%-- 자동정렬 : ctrl+alt+l --%>
<jsp:include page="/common/header.jsp"></jsp:include>
${faqs} : 데이터 <br>
${pages.totalPages} : 총페이지수 <br>
${pages.number} : 현재페이지번호 <br>
${pages.size} : 화면에 보일개수 <br>
<div class="page mt3">
    <form id="listForm" name="listForm" method="get">
        <%--     TODO: 컨트롤러로 page(현재페이지번호) 값 전송    --%>
        <input type="hidden" id="page" name="page" value="0">

        <div class="input-group mb3 mt3">
            <input type="text"
                   class="form-control"
                   id="searchKeyword"
                   name="searchKeyword"
                   placeholder="제목입력"
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
                <th scope="col">fno</th>
                <th scope="col">title</th>
                <th scope="col">content</th>
            </tr>
            </thead>
            <tbody>
            <!-- 반복문 -->
            <c:forEach var="data" items="${faqs}">
                <tr>
                    <td>
                        <a href="/faq/edition?fno=${data.fno}">
                            <c:out value="${data.fno}"/>
                        </a>
                    </td>
                    <td><c:out value="${data.title}"/></td>
                    <td><c:out value="${data.content}"/></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <div id="paging" class="flex-center">
            <ul class="pagination" id="pagination"></ul>
        </div>
    </form>

</div>
<!-- jquery -->
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<!-- 부트스트랩 js -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>

<script>
    function fn_egov_link_page(page) {
        $("#page").val(page);
        $("#listForm").attr("action", "/faq")
            .submit();
    }
</script>

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



