<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<% 
	String age = request.getParameter("age");
	String iname = request.getParameter("iname");
	String address = request.getParameter("address");
	String gender = request.getParameter("gender");
	String[] hobbys = request.getParameterValues("hobbys");
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

	<h1>넘겨받은 나이는 <%= age %>입니다.</h1>
	<h1>넘겨받은 이름은 <%= iname %>입니다.</h1>
	<h1>넘겨받은 주소는 <%= address %>입니다.</h1>
	<h1>넘겨받은 성별은 <%= gender %>입니다.</h1>
	<h1>넘겨받은 취미는 <%= hobbys[0] %>입니다.</h1>
	<h1>넘겨받은 취미는 <%= hobbys[1] %>입니다.</h1>
	<h1>넘겨받은 취미는 <%= hobbys[2] %>입니다.</h1>




<script>
	//여기에 jquery 코드 작성
</script>
</body>
</html>