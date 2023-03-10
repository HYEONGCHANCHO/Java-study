<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%
	int age = Integer.parseInt(request.getParameter("age"));
	String userName = request.getParameter("userName");

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
	<p>너 내곁에 없으면 나 혼자 설 수 없나니 너 나의 구원이요 난 가늘한 실바람이라</p>
	나이는 : <%=age %> <br />
	이름은 :<%=userName %>
	<%= request.getAttribute("aaaaa") %>
<script>
	//여기에 jquery 코드 작성
</script>
</body>
</html>