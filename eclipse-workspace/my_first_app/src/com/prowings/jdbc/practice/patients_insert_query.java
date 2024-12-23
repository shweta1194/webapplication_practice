package com.prowings.jdbc.practice;

import java.sql.Connection;
	import java.sql.Date;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.ArrayList;
	import java.util.List;
	public class patients_insert_query 
		

	 {

		public static void main(String[] args) {
			
			Connection con = null;

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");

				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_management", "root",
						"Shwetatech@8805");

				Statement stmt = con.createStatement();

				String insertQuery = "insert into patients (name,address,gender,date_of_birth) values ('ramesh','sangali','male','1985-06-03')";
				
				int pt = stmt.executeUpdate(insertQuery);
				
				System.out.println("insert query: "+pt);

			} catch (ClassNotFoundException e) {
				System.out.println("some error111 occured"+e.getMessage());
				e.printStackTrace();
			} catch (SQLException e) {
				System.out.println("some error222 occured"+e.getMessage());
				e.printStackTrace();
			}
				catch (Exception e) {
					System.out.println("some error occured"+e.getMessage());
					e.printStackTrace();
				}
			
			finally {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

	}



