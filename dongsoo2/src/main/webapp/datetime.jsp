<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>대관시간 정보</title>
	<style>
		fieldset { background="color:blue" }
	</style>
</head>
<body>
	<fieldset>
		<legend>오늘</legend>
		<h3>오늘 대관시간은 <mark>${ start1 }</mark>부터 <mark>${ end1 }</mark>까지입니다.</h3>
	</fieldset>
	<br>
	<fieldset>
		<legend>다른 날짜</legend>
		<h3>다른 날짜 대관시간은 <mark><span style="color:blue">${ start2 }</span></mark>부터 <mark><span style="color:green">${ end2 }</span></mark>까지입니다.</h3>
	</fieldset>
</body>
</html>