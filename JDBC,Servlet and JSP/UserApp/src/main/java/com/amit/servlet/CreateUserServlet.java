package com.amit.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateUserServlet
 */
@WebServlet(urlPatterns = "/addServlet")
public class CreateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Connection connection;

	public void init(ServletConfig config) {
		

		try {
			ServletContext context = config.getServletContext();
			System.out.println("Init method called");
			
			Enumeration<String> parameterNames = context.getInitParameterNames();

			while (parameterNames.hasMoreElements()) {
				String eachName = parameterNames.nextElement();
				System.out.println("context param name : " + eachName);
				System.out.println("context param value : " + context.getInitParameter(eachName));
			}
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(context.getInitParameter("dbUrl"),context.getInitParameter("dbUser"),context.getInitParameter("dbPassword"));
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
		
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		try {
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate("insert into user values('" + firstName + "','" + lastName + "','"
					+ email + "','" + password + "')");
			PrintWriter out = response.getWriter();
			if(result > 0) {
				out.print("<h1>USER CREATED SUCCESSFULLY.<h1>");
			}
			else {
				out.print("<h1>ERROR IN CREATING USER.<h1>");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void destroy() {
		System.out.println("Destroy method called");
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
