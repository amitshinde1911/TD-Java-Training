package com.amit.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateUserServlet
 */
@WebServlet("/deleteServlet")
public class DeleteUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Connection conn;

	public void init() {
		System.out.println("Init method called");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Cdac@05032024$");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String email = request.getParameter("email");
//		String password = request.getParameter("password");
		
		try {
			Statement statement = conn.createStatement();
			
			int result = statement.executeUpdate("delete from user where email= '"+email+"'");
			
		
			
			
			PrintWriter out = response.getWriter();
			if(result > 0) {
				out.print("<h1>USER DELETED SUCCESSFULLY.<h1>");
			}
			else {
				out.print("<h1>ERROR IN DELETING USER.<h1>");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void destroy() {
		System.out.println("Destroy method called");
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
