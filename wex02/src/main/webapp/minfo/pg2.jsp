<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<% 
    String logId = (String)session.getAttribute("memId");
	if(logId == null){
		response.sendRedirect("/wex02/loginForm.jsp");
	}
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta property="keywords" content="여기에 중요한 키워드 8개 정도 나열" />
<meta property="description" content="이 페이지를 설명하는 키워드를 문장형식으로 나열" />
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
	<h1>이 페이지는 회원 전용 첫번째 페이지 입니다.</h1>
<script>
	//여기에 jquery 코드 작성
</script>
</body>
</html>