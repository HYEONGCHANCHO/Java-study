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
<h1>회원가입화면</h1>
<form action="./memberAddPro.jsp">
	<input type="text" name="id" placeholder="id입력" /><br />
	<input type="password" name="password" placeholder="password입력" /><br />
	<input type="text" name="name" placeholder="name입력" /><br />
	<input type="text" name="address" placeholder="address입력" /><br />
	<input type="text" name="registerdate" placeholder="등록일 입력" /><br />
	<input type="text" name="email" placeholder="email입력" /><br />
	<input type="submit" value="회원가입" />
</form>
<script>
	//여기에 jquery 코드 작성
</script>
</body>
</html>