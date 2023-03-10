<%@page import="com.chan.webexam01.vo.DataVo"%>
<%@page import="java.util.List"%>
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
	<h2>포워딩된 페이지 입니다.</h2>
	<% List<DataVo> requestAtt= (List<DataVo>)request.getAttribute("requestAtt"); %>
	<h3>requeset 영역에 만들어진 속성값의 자료에 대한 각각의 데이터 1 age 필드 값: <%=requestAtt.get(1).getAge()%></h3>
	<h3>requeset 영역에 만들어진 속성값의 자료에 대한 각각의 데이터 2 iname 필드 값 : <%=requestAtt.get(1).getIname()%></h3>
	<h3>requeset 영역에 만들어진 속성값의 자료에 대한 각각의 데이터 3 gender 필드 값: <%=requestAtt.get(1).getGender()%></h3>
	<h3>requeset 영역에 만들어진 속성값의 자료에 대한 각각의 데이터 4 address 필드 값: <%=requestAtt.get(1).getAddress()%></h3>
	<h3>session 영역에 만들어진 속성값 : <%=session.getAttribute("sessionAtt") %></h3>
	<h3>application 영역에 만들어진 속성값 : <%= application.getAttribute("applicationAtt")%></h3>
	
<script>
	//여기에 jquery 코드 작성
</script>
</body>
</html>