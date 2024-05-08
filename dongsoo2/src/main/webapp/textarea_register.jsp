<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>Textarea</title>
</head>
<body>
	<fieldset>
		<legend>가입 정보</legend>
		<h3>아이디 : ${ user_id }></h3>
		<h3>비밀번호 : ${ user_pw1 }</h3>
		
		<% 	if ((boolean)request.getAttribute("user_pw3")){ %>
			<p><b>비밀번호 확인: <span style="color:blue">일치</span></b></p>
		<% } else { %>
			<p><b>비밀번호 확인: <span style="color:red">불일치</span></b></p>
		<% } %>	
				
		<h3>이름 : ${ user_name }</h3>
		<h3>메일 주소 : ${ user_mail }</h3>
		<h3>전화번호 : ${ user_tel }</h3>
	</fieldset>
</body>
</html>