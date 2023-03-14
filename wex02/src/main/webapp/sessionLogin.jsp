<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<% 
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	if (id.equals(password)){
		session.setAttribute("memId", id);
		session.setMaxInactiveInterval(60*10);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta property="keywords" content="여기에 중요한 키워드 8개 정도 나열" />
<meta property="description" content="이 페이지를 설명하는 키워드를 문장형식으로 나열" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<h1>로그인성공</h1>

</body>
</html>
<% 
	}else{
%>
<script>
	alert("로그인 실패!!!!");
	history.go(-1);
</script>
<%
	}
%>