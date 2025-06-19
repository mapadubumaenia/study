<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<!-- TODO: c 라이브러리 import -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	<!--머리말  -->
	<!-- 부서 추가페이지 -->
	<!--주의점: 기본키입력 상자는 없음=>사용자가 임의로 변경하면 안되니까(자동증가로 해야함: 시퀀스, 자바코딩)  -->
	<!--1)입력값(쿼리스트링) -> 해당컨트롤러 전송 
	  html 태그의 속성 name="변수": 이 변수가 쿼리스트링으로 전동쇱니다.
	 -->
	<jsp:include page="/common/header.jsp"></jsp:include>

	<div class="page mt5">

		<form id="addForm" name="addForm" method="post">
			<!--부트스트랩 테마 입력상자  -->
			<!--부서명(dname)  -->
			<div class="mb3">
				<label for="dname" class="form-label">dname</label> 
				<input type="text" class="form-control"
					id="dname" name="dname"  placeholder="부서명">
			</div>
			
			<!--부서위치  -->
			<div class="mb3">
				<label for="loc" class="form-label">loc</label> 
				<input type="text" class="form-control"
					id="loc" name="loc" placeholder="부서위치">
					</div>
					
			<!--버튼추가  -->
			<div class="mb3">
			<button type="button" class="btn btn-primary" onclick="fn_save()">저장</button>
			</div>
		</form>

	</div>
	<!--꼬리말  -->
	<jsp:include page="/common/footer.jsp"></jsp:include>
	<!--jquerry cdn  -->
	<script src="https://code.jquery.com/jquery-3.1.0.js"></script>
	<script type="text/javascript">
   function fn_save() {
      /* /emp/add.do (저장)주소로 요청 */
      $("#addForm").attr("action","<c:out value='/dept/add.do' />")
      .submit();         
   }
</script>
	
</body>
</html>