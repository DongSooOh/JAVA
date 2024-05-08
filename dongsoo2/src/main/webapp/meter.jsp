<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>웹 폼(Meter)</title>
	<style>
		body { background-color:#fff; }
		ul li {
			list-style:none;
			margin:15px 0;
			font-size:14px;
		}
	</style>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
	String user_top=request.getParameter("top");
	String user_pants=request.getParameter("pants");
	String user_shoes=request.getParameter("shoes");
%>
	<form>
		<fieldset id="subject">
			<legend>쇼핑몰 판매량</legend>
			<ul>
				<li>
					<label>상의</label>
					<meter value=<%= user_top %>></meter>
				<li>
					<label>하의</label>
					<meter min="0" max="100" value=<%= user_pants %>></meter>
				<li>
					<label>신발</label>
					<meter min="0" max="600" low="0" high="500" value=<%= user_shoes %>></meter> 
			</ul>
		</fieldset>
	</form>
</body>
</html>