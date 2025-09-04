<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 25. 9. 2.
  Time: 오후 4:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<html>
<head>
    <title>Title</title>
    <!-- 	부트스트랩 css  -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <!-- 	개발자 css -->
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<jsp:include page="/common/header.jsp"></jsp:include>
<%--본문--%>
<div class="page mt3">
    <form id="listForm" name="listForm" action="/search" method="get">
        <%--   TODO: 1)페이지 번호 저장(input:hidden)     --%>
        <input type="hidden" id="page" name="page" value="0">
        <%--   TODO: 2)결과 반복문(ul-li)--%>
        <h1 class="mt5 mb5">통합검색 결과</h1>
        <ul class="list-group">
             <%-- 반복문 시작   --%>
            <c:forEach var="data" items="${searches}">
            <li class="list-group-item active" aria-current="true"><c:out value="${data.type}"></c:out></li>

                <c:if test="${not empty data.dname}">
            <li class="list-group-item"><c:out value="${data.dname}"></c:out></li>
                </c:if>
                <c:if test="${not empty data.loc}">
            <li class="list-group-item"><c:out value="${data.loc}"></c:out></li>
                </c:if>
                <c:if test="${not empty data.ename}">
            <li class="list-group-item"><c:out value="${data.ename}"></c:out></li>
                </c:if>
                <c:if test="${not empty data.job}">
            <li class="list-group-item"><c:out value="${data.job}"></c:out></li>
                </c:if>
            </c:forEach>
        </ul>
        <c:if test="${empty searches}">
            데이터가 없습니다.
        </c:if>
            <%--   TODO: 3)페이지 번호(플러그인)     --%>
            <!-- 여기: 페이지번호 -->
            <div class="flex-center mt5">
                <ul class="pagination" id="pagination"></ul>
            </div>
    </form>
</div>









<!-- jquery -->
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<!-- 부트스트랩 js -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>

<!-- TODO: 페이징 라이브러리(CDN 사용) -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/twbs-pagination/1.4.2/jquery.twbsPagination.min.js"></script>
<script type="text/javascript">
    /* 페이징 처리 */
    $('#pagination').twbsPagination({
        totalPages: ${pages.totalPages},
        startPage:${pages.number+1},            // 프론트 현재페이지: 첫페이지번호(벡엔드: 0, 프론트: 1)
        visiblePages: ${pages.size},
        initiateStartPageClick: false,
        onPageClick: function (event, page) {
            $("#page").val(page-1);
            $("#listForm").submit();
        }
    });
</script>

<jsp:include page="/common/footer.jsp"></jsp:include>
</body>
</html>
