<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%
	//쿠키 이름은 spviewlist, 쿠키값으로는 0001저장하고자 한다. 
	// 쿠키 자체가 있는지 확인한다.
		// 없다면 새로만들어서 0001을 할당한다.
		// 있다면 spviewlist쿠키명이 기존에 존재하는지 확인한다.
			//1. 존재하는 경우 : 기존의 것에 추가한다. 2.없는 경우 : 새로 만들어서 값으로 0001을 저장한다.
	Cookie[] cookies =request.getCookies();
	if(cookies!=null){//쿠키자체가 있는지 따진다.(있는경우)
		boolean isspviewlist= false;
		Cookie getCookie = null;
		for(int i=0;i<cookies.length;i=i+1){
			isspviewlist=cookies[i].getName().equals("spviewlist");
				if(isspviewlist){
					getCookie = cookies[i];
					break;
				}
		}
		if(isspviewlist){
			getCookie.setValue(getCookie.getName()+"/0002");
			response.addCookie(getCookie);
			
		}else{
			Cookie cookie = new Cookie("spviewlist","0002");
			cookie.setMaxAge(60*60*24*30);
			response.addCookie(cookie);
		}
	}else{ //쿠키자체가 있는지 따진다. (없는경우)
		Cookie cookie = new Cookie("spviewlist","0002");
		cookie.setMaxAge(60*60*24*30);
		response.addCookie(cookie);
	}
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
<h1>의류상품상세 페이지입니다.</h1>
<script>
	//여기에 jquery 코드 작성
</script>
</body>
</html>