<%@page import="com.chan.webexam01.vo.DataVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%
	String iname = "홍길동";
	DataVo vo = new DataVo(19, "나일등", "수원살아유", "남자");

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
	<h1>서버의 iname에 저장된 값은 <%=iname.substring(1) %>입니다.</h1>
	<h1>서버의 iname에 저장된 값은 <% out.print(iname.substring(1)); %>입니다.</h1>
	<p>나이 : <%=vo.getAge() %> </p>
	<p>이름 : <%=vo.getIname() %> </p>
	<p>주소 : <%=vo.getAddress() %> </p>
	<p>성별 : <%=vo.getGender() %></p>

<script>
	//여기에 jquery 코드 작성
</script>
</body>
</html>