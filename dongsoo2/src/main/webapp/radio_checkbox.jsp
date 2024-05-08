<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Radio_checkbox</title>
	</head>
<%
	request.setCharacterEncoding("UTF-8");
	String subject=request.getParameter("subject");
	String[] mailings=request.getParameterValues("mailing");
	String mailing_return="";
	
	for (int i=0; i < mailings.length; i++) {
		if (mailings[i] == null) continue;
		else {
				mailing_return = mailing_return + mailings[i] + "\t";
		}
	}	
%>
<body>
	<fieldset>
		<legend>신청 과목</legend>
		<h3>신청 과목 : <%= subject %></h3>
	</fieldset>
	<fieldset>
		<legend>메일링</legend>
		<h3>메일링 : <%= mailing_return %></h3>
	</fieldset>
</body>
</html>