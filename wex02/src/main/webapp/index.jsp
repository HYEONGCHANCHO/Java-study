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
<%=session.getId() %>
<% 
	session.setAttribute("sesLog", "chan");
	request.setAttribute("reqLog", "gildong");
%>
<%
	String logId = (String)session.getAttribute("memId");
	if(logId != null){
		out.print("로그인한 상태입니다.");
		out.print(logId+"님 반갑습니다.");
		out.print("<a href=\"logoutForm.jsp\">로그아웃 </a><br/>");
	}else{
		out.print("로그인 되지 않은 상태입니다.");
		out.print("<a href=\"loginForm.jsp\">로그인 화면</a><br/>");
		
	}
%>
<div>
	<p>001의 내용들이 여기에 나옵니다. 일반적인 정보입니다.</p>
	<p>002의 내용들이 여기에 나옵니다. 일반적인 정보입니다.</p>
	<p>003의 내용들이 여기에 나옵니다. 일반적인 정보입니다.</p>
	<p>004의 내용들이 여기에 나옵니다. 일반적인 정보입니다.</p>
	<p>005의 내용들이 여기에 나옵니다. 일반적인 정보입니다.</p>
	<p>006의 내용들이 여기에 나옵니다. 일반적인 정보입니다.</p>
	<p>007의 내용들이 여기에 나옵니다. 일반적인 정보입니다.</p>
	<p>008의 내용들이 여기에 나옵니다. 일반적인 정보입니다.</p>
	<p>009의 내용들이 여기에 나옵니다. 일반적인 정보입니다.</p>
	<p>010의 내용들이 여기에 나옵니다. 일반적인 정보입니다.</p>
	<p>011의 내용들이 여기에 나옵니다. 일반적인 정보입니다.</p>
	<p>012의 내용들이 여기에 나옵니다. 일반적인 정보입니다.</p>
	<p>013의 내용들이 여기에 나옵니다. 일반적인 정보입니다.</p>
	<p>014의 내용들이 여기에 나옵니다. 일반적인 정보입니다.</p>
	<p>015의 내용들이 여기에 나옵니다. 일반적인 정보입니다.</p>
</div>

<script>
	//여기에 jquery 코드 작성
</script>
</body>
</html>