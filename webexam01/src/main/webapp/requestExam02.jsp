<%@page import="java.util.Enumeration"%>
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
<%
	//파라메터이름(네트워크상에서 자료를 전달하는 변수)을 모를 때 =>getParameterNames()
	Enumeration<String> paramNames = request.getParameterNames();
	while(paramNames.hasMoreElements()){
		String parameterName=paramNames.nextElement();
		String[] requestDatas = request.getParameterValues(parameterName);
		for (int i=0; i<requestDatas.length; i=i+1){
			out.print("<h1>"+requestDatas[i]+"</h1>");
		}
	}
	
%>
<script>
	//여기에 jquery 코드 작성
</script>
</body>
</html>