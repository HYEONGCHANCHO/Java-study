<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
	<%
		session.invalidate();
		response.sendRedirect("/wex02");
	%>
