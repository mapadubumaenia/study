<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
<link rel="stylesheet" href="/css/00_style.css">
</head>
<body>
	<jsp:include page="/common/header.jsp"></jsp:include>
	<div class="page mt5">
		<form id="addForm" name="addForm" method="post">
		

			<div class="mb3">
				<label for="ename" class="form-label">ename</label> <input
					type="text" class="form-control" id="ename" name="ename"
					placeholder="사원명">
			</div>

			<!--직위  -->
			<div class="mb3">
				<label for="job" class="form-label">job</label> <input type="text"
					class="form-control" id="job" name="job" placeholder="직위">
			</div>
			
			<!--관리자  -->
			<div class="mb3">
				<label for="manager" class="form-label">manager</label> <input type="text"
					class="form-control" id="manager" name="manager" placeholder="관리자">
			</div>

			<!--버튼추가  -->
			<div class="mb3">
				<button type="button" class="btn btn-primary"   onclick="fn_save()">저장</button>
			</div>

		</form>

	</div>

<jsp:include page="/common/footer.jsp"></jsp:include>
<script src="https://code.jquery.com/jquery-3.1.0.js"></script>
	<script type="text/javascript">
	 function fn_save() {
		   /*DB에 입력값들을 전송해서 저장: /dept/add.do 컨트롤러 메소드가 저장함  */
		 $("#addForm").attr("action","<c:out value='/emp/add.do'/>" )
	      .submit();
		}
	</script>
	
	


</body>
</html>