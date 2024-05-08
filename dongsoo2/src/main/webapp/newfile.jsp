<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>request 활용하기(출력)</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
	String search = request.getParameter("search");
%>
	<h1>검색 내용 : <%= search%></h1>
</body>
</html>