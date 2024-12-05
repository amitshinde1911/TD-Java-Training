package com.amit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountDAO {
	
	public static void main(String[] args) {
		
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "Cdac@05032024$");
			 Statement statement = connection.createStatement();
			 ResultSet rs = statement.executeQuery("select * from account");) {
			
			
			System.out.println(connection);
			
//			int result = statement.executeUpdate("insert into account values(1,'Shinde','Amit',100000)");
//			System.out.println(result+" rows got inserted into db.");
//			int result = statement.executeUpdate("update account set bal=200000 where lastname='Shinde'");
//			System.out.println(result+" rows got updated into db.");
//			int result = statement.executeUpdate("delete from account where accno=1");
//			System.out.println(result+" rows got deleted into db.");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(3)+" "+rs.getString(2)+" "+rs.getInt(4));
//				System.out.println(rs.getString(3));
//				System.out.println(rs.getString(2));
//				System.out.println(rs.getInt(4));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}

}
