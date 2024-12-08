package com.amit.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateUserServlet
 */

public class ReadUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Connection connection;

	public void init(ServletConfig config) {
		System.out.println("Init method called");
		ServletContext context = config.getServletContext();
		Enumeration<String> parameterNames = context.getInitParameterNames();

		while (parameterNames.hasMoreElements()) {
			String eachName = parameterNames.nextElement();
			System.out.println("context param name : " + eachName);
			System.out.println("context param value : " + context.getInitParameter(eachName));
		}

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(context.getInitParameter("dbUrl"),
					context.getInitParameter("dbUser"), context.getInitParameter("dbPassword"));
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from user");
			PrintWriter out = response.getWriter();
			out.print("<table>");
			out.print("<tr>");
			out.print("<th>");
			out.println("First Name");
			out.print("</th>");
			out.print("<th>");
			out.println("Last Name");
			out.print("</th>");
			out.print("<th>");
			out.println("Email");
			out.print("</th>");
			out.print("<th>");
			out.println("Password");
			out.print("</th>");
			out.print("</tr>");
			while (rs.next()) {
				out.println("<tr>");
				out.println("<td>");
				out.print(rs.getString(1));
				out.println("</td>");
				out.println("<td>");
				out.print(rs.getString(2));
				out.println("</td>");
				out.println("<td>");
				out.print(rs.getString(3));
				out.println("</td>");
				out.println("<td>");
				out.print(rs.getString(4));
				out.println("</td>");
				out.println("</tr>");
			}
			out.print("</table>");

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
