<%@page import="com.chan.useck.CookieBox"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%
	CookieBox cookieBox = new CookieBox(request);	
	String cookieName ="spviewlist";
	String cookieValue = "0003";
	String path="/";
	int maxage = 3600*24*30;
	Cookie cookie = null;
	
	if(cookieBox.existCookie(cookieName )){ //존재한다. => 기존 쿠키에 현재 상품추가
		cookie = cookieBox.cookieValueAppend(cookieBox.getCookie(cookieName), cookieValue);
		cookie.setPath(path);
	}else{
		cookie = CookieBox.createCookie(cookieName, cookieValue, path,maxage);
	} //존재하지 않는다. => 새롭게 쿠키를 만든다.
	response.addCookie(cookie);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="keywords" content=" 여기에 중요한 키워드 8개정도 나열" />
<meta name="description" content="이페이지를 설명하는 키워드를 문장형식으로 나열" />
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
<h1>의류 상품상세페이지 입니다....</h1>

<script>
	//여기에 jquery 코드 작성
</script>
</body>
</html>