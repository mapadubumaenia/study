<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/00_style.css">
</head>
<body>
   <div class="page mt5">
      <h2>Ajax 예제</h2>
      <button id="btn">Hello</button>
      <p id="result"></p>
   </div>
   
   <script src="https://code.jquery.com/jquery-3.1.0.js"></script>
   <!-- ajax 문제 풀기 -->
   <script type="text/javascript">
   $(function () {
      /* 버튼 클릭 */
      $("#btn").click(function () {
        
         $.ajax({
            url: "/qz05/ajaz01.do",
            type: "GET",
            success: function (data) {
               console.log(data);      // 콘솔탭 확인용도
               alert(data);            // 결과 화면 표시
               $("#result").text(data); // 태그사이에 data 표시함
            },
            error: function () {
               console.log("에러 발생");
            }
         });
      });
   });
</script>
</body>
</html>