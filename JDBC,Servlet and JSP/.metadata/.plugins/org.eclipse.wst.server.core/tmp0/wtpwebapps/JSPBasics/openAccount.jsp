<%@ page import="java.sql.*" language="java"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%!Connection conn;
	PreparedStatement ps;

	public void jspInit() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "Cdac@05032024$");
			ps = conn.prepareStatement("insert into account value(?,?,?,?)");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void jspDestroy() {
		try {
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}%>
	
	<%
	int accno = Integer.parseInt(request.getParameter("accno"));
	String lastName = request.getParameter("lastname");
	String firstName = request.getParameter("firstname");
	int bal = Integer.parseInt(request.getParameter("bal"));
	
	ps.setInt(1, accno);
	ps.setString(2, lastName);
	ps.setString(3, firstName);
	ps.setInt(4, bal);
	
	ps.executeUpdate();
	
	%>
	
	<%@include file="openaccount.html" %>

