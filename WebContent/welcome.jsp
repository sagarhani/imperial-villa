<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome Sir!</title>
<title>Welcome</title>
</head>
<body bgcolor="orange">
Welcome 
<%
String uname=(String) request.getAttribute("fname");

%>

<%=uname%>
<div align="center"><b>Welcome You have been sucessfully logged in!!!</b>
<img src="abc.png" width="100px" height="50px">

</div>

</body>
</html>