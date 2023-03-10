<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%
	Cookie sangpumInfo =new Cookie("viewsp","Tv");
	sangpumInfo.setMaxAge(30);
	Cookie loginInfo =new Cookie("loginInfo","chan");
	loginInfo.setMaxAge(60);
	response.addCookie(sangpumInfo);
	response.addCookie(loginInfo);

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
<h1>쿠키 발급 페이지</h1>
<p>2개의 쿠키가 발급되었습니다.</p>
<a href="./spview.jsp">상품정보 보기</a>
<script>
	//여기에 jquery 코드 작성
</script>
</body>
</html>