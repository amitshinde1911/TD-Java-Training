package com.amit.customtags;

import java.io.IOException;
import java.net.Authenticator.RequestorType;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class ResultHandler extends TagSupport {
	
	Connection conn;
	PreparedStatement ps;
	
	public ResultHandler(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver ");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306//mydb");
			 ps = conn.prepareStatement("select * from user where email=?");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public int doStartTag() throws JspException {
		
		ServletRequest request = pageContext.getRequest();
		
		String email = request.getParameter("email");
		
		try {
			ps.setString(1, email);
			ResultSet rs = ps.executeQuery();
			JspWriter out = pageContext.getOut();
			if(rs.next()) {
				
				out.print("User Details are : <br/> First Name");
				out.print(rs.getString(1));
				out.print("<br/> Last Name");
				out.print(rs.getString(2));
			} else {
				out.print("Invalid email id enetered");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return Tag.SKIP_BODY;
	}
	
	@Override
	public void release() {
	try {
		ps.close();
		conn.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	}

}
