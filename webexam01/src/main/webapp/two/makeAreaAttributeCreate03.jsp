<%@page import="java.util.ArrayList"%>
<%@page import="com.chan.webexam01.vo.DataVo"%>
<%@page import="java.util.List"%>
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
<h1>여기에서 4개의 영역에 속성을 만듭니다</h1>
<%
	List<DataVo> list = new ArrayList<DataVo>();
	list.add(new DataVo(120,"aa","aaa","aaaa"));
	list.add(new DataVo(130,"bb","bbb","bbbb"));
	list.add(new DataVo(150,"cc","ccc","cccc"));
	pageContext.setAttribute("pageAtt", "page 영역에 만들어진 속성값");
	request.setAttribute("requestAtt", list);
	session.setAttribute("sessionAtt", new Date());
	application.setAttribute("applicationAtt", "application 영역에 만들어진 속성값");
%>

<jsp:forward page="./to.jsp"></jsp:forward>
<h3>요청 페이지!!!page 영역에 만들어진 속성값 : <%=pageContext.getAttribute("pageAtt") %></h3>
<h3>요청 페이지!!!requeset 영역에 만들어진 속성값 : <%=request.getAttribute("requestAtt")%></h3>
<h3>요청 페이지!!!session 영역에 만들어진 속성값 : <%=session.getAttribute("sessionAtt") %></h3>
<h3>요청 페이지!!!application 영역에 만들어진 속성값 : <%= application.getAttribute("applicationAtt")%></h3>


<script>
	//여기에 jquery 코드 작성
</script>
</body>
</html>