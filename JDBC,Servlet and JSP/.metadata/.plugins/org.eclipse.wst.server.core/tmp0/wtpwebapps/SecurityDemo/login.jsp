<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<form action="j_security_check" method="post">
User Name : <input name="j_security_check" /><br/>
Password : <input type="password" name="j_password"><br/>
<input type="submit" value="submit" />


</form>

</body>
</html>