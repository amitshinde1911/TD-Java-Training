<%@page import="com.amit.spring.springmvc.dto.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.amit.spring.springmvc.dto.Employee, java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List of Employees</title>
</head>
<body>
	<%
		List<Employee>employees = (List<Employee>) request.getAttribute("employees");
		for(Employee e:employees){
			out.println(e.getId());
			out.println(e.getName());
			out.println(e.getSalary());
		}
	
	%>

</body>
</html>