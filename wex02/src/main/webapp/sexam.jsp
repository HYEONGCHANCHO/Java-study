<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
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
<%--<%=session.getId() --%> <%--세션 ID 가져옴 --%>
<%--<%=new Date(session.getCreationTime()).toString() %> <%--세션 ID 발급될 때의 시간 정보를 가져옴 --%>
<%
	Date sessionDate = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 -mm분-ss초");
%>
발급된 세션 아이디 : <%=session.getId()%> <br />
최초 세션 아이디가 발급된 시간 : <%= dateFormat.format(session.getCreationTime()) %> <br />
가장 최근에 접속한 시간 : <%= dateFormat.format(session.getLastAccessedTime()) %>  <br />
======================<br />
리퀘스트 영역에 저장된 자료(속성값) : <%=request.getAttribute("reqLog") %><br />
세션 영역에 저장된 자료(속성값) : <%=request.getAttribute("seLog") %>

<script>
	//여기에 jquery 코드 작성
</script>
</body>
</html>