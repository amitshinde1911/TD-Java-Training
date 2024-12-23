<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration Response</title>
</head>
<body>
	<h1>User Registered Successfully.</h1>
	<h3>User Details are : </h3>
	<%= request.getAttribute("user")  %>

</body>
</html>