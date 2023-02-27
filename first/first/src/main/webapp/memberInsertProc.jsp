<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%
	//자바 코드가 들어가는 곳
	String userId = request.getParameter("userId"); //입력으로 넘어온 자료를 가져오겠다.
	String pwd = request.getParameter("pwd");  //입력으로 넘어온 자료는 파라메터라고 한다.
	String iname = request.getParameter("iname"); 
	String addr = request.getParameter("addr");
	
	System.out.println("입력한 아이디는 "+userId+"입니다. => 이 자료를 엑셀에 저장할 것임");
	Member insertData = new Member(userId,pwd,iname,addr);
	out.print("<h1>회원 가입이 완료되었습니다.!!!!</h1>");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
</body>
</html>