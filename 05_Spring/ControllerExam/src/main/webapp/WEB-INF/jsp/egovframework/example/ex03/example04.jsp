<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- jsp 반복문 추가 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/00_style.css">
</head>
<body>
	<div class="page mt5">
		${name} ${color}

		<!-- name=='삼식이' 참이면 안에 태그가 보임, 거짓이면 안보임 -->
		<c:if test="${name=='삼식이'}">
			<p>삼식이가 맞습니다.</p>
		</c:if>

		<!-- 2) choose문:  -->
		<c:choose>
			<c:when test="${color=='brown'}">
				<p>갈색</p>
			</c:when>
			<c:when test="${color=='yellow'}">
				<p>노란색</p>
			</c:when>
			<c:otherwise>다른색깔</c:otherwise>
		</c:choose>
		
		
	</div>


</body>
</html>