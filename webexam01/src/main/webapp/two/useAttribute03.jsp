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
	<h1>각각의 영역에 저장된 속성 값 출력</h1>

<h3>page 영역에 만들어진 속성값 : <%=pageContext.getAttribute("pageAtt") %></h3>
<h3>requeset 영역에 만들어진 속성값 : <%=request.getAttribute("requestAtt")%></h3>
<h3>session 영역에 만들어진 속성값 : <%=session.getAttribute("sessionAtt") %></h3>
<h3>application 영역에 만들어진 속성값 : <%= application.getAttribute("applicationAtt")%></h3>
<script>
	//여기에 jquery 코드 작성
</script>
</body>
</html>