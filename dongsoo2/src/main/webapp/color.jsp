<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>선택한 색상</title>
	<style>
	div {
		background-color:${color};	
	}
	</style>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		String color=request.getParameter("color");
	%>
<div>
	<fieldset>
		<legend>색상 정보</legend>
		<h3>선택한 색상 : <%= color %></h3>
	</fieldset>
</div>		
</body>
</html>