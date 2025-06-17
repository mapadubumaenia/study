<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Insert title here</title>
<!-- 부트스트랩 css -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<link rel="stylesheet" href="/css/00_style.css">
</head>
<body>
<!-- jsp에서 파일을 분리하는 사용법: 머리말, 꼬리말 분리해서 합체 -->
<!-- header.jsp 의 내용이 아래에 보입니다. -->
<jsp:include page="/common/header.jsp"></jsp:include>   
   <div class="page mt5">
      ${list}
   </div>


<jsp:include page="/common/footer.jsp"></jsp:include>
</body>
</html>