<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
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
	<h1>고향의 봄</h1>
	<jsp:include page="./sub.jsp"></jsp:include>
<br />========================<br />
	<h2>청아한 사랑</h2>
	<%
		request.setAttribute("aaaaa", 123456);
	%>
	<jsp:include page="./sub2.jsp">
		<jsp:param value="19" name="age"/>
		<jsp:param value="chan" name="userName"/>
	</jsp:include>
	<h1>메인의 마지막 내용임</h1>
<script>
	//여기에 jquery 코드 작성
</script>
</body>
</html>