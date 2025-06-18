<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Insert title here</title>
<!-- 부트스트랩 css -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
<link rel="stylesheet" href="/css/00_style.css">
</head>
<body>
	<!-- jsp에서 파일을 분리하는 사용법: 머리말, 꼬리말 분리해서 합체 -->
	<!-- header.jsp 의 내용이 아래에 보입니다. -->
	<jsp:include page="/common/header.jsp"></jsp:include>
	<form id="listform" name="listform" method="get" >

		<div class="page mt5">
			<!--1)검색어  -->
			<!--쿼리스트링으로 검색어를 컨트롤로 전송 name="searchKeyword" (이 속성:쿼리스트링으로 전송됨)  -->
			<div class="input-group mb-3">
				<input type="text" class="form-control" id="searchKeyword"
					name="searchKeyword" placeholder="부서명 입력">
				<button class="btn btn-primary" type="button" 
				onclick="fn_egov_selectList()"
				>Button</button>
			</div>

			<!--2)부트스트랩 테마: 테이블  -->
			<table class="table">
				<thead>
					<tr>
						<th scope="col">dno</th>
						<th scope="col">dname</th>
						<th scope="col">loc</th>
					</tr>
				</thead>
				<tbody>
					<!--반복문 돌릴 예정  -->
					<c:forEach var="data" items="${list}">
						<tr>
							<td><c:out value="${data.dno}"></c:out></td>
							<td><c:out value="${data.dname}"></c:out></td>
							<td><c:out value="${data.loc}"></c:out></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<!--2)부트스트랩 테마: 추가 버튼  -->
			<div class="tcenter">
			<a href="javascript:fn_addView()" 
			class="btn btn-primary" >추가</a>
			</div>
			
		</div>

	</form>
      <script src="https://code.jquery.com/jquery-3.1.0.js"></script>
      <script type="text/javascript">
      /*검색어 조회  */
      /*js 함수 사용법: function 함수명(매개변수){}  */
      function fn_egov_selectList() {
		/*/dept/dept.do 컨트롤러 함수로 검색어를 전송(쿼리스트링)  */
		$("#listform").attr("action","<c:out value='/dept/dept.do' />")
		   .submit();
	}
      /*추가 페이지 열기  */
      function fn_addView() {
		/* add_dept.jsp 페이지 열기 */
		$("#listform").attr("action","<c:out value='/dept/addition.do'/>" )
		      .submit();
	}
      </script>
    


	<jsp:include page="/common/footer.jsp"></jsp:include>
</body>
</html>