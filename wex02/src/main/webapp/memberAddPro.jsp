<%@page import="wex02.MemberInfoBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<jsp:useBean id="member" scope="request" class="wex02.MemberInfoBean" /> 
<jsp:setProperty name="member" property="*" /> 
    
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
<%=member.getId() %>의 자료를 넘겨받았습니다 <br/>
<jsp:getProperty name="member" property="id" /> 
<%=member.toString()%>의 자료를 넘겨받았습니다 <br/>
등록일 : <%=member.getRegisterDate() %>의 자료를 넘겨받았습니다 <br/>
<script>
	//여기에 jquery 코드 작성
</script>
</body>
</html>