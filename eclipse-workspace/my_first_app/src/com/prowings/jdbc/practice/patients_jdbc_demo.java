package com.prowings.jdbc.practice;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class patients_jdbc_demo {

	public static void main(String[] args) {
		
		Connection con = null;
		List<patients> ptList = new ArrayList<>();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_management", "root",
					"Shwetatech@8805");

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("select * from patients");

			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getNString("name");
				String address = rs.getNString("address");
				String gender = rs.getNString("gender");
				Date date_of_birth = rs.getDate("date_of_birth");

				System.out.println("fetched row from database: " + "id =" + id + " name =" + name + " address ="
						+ address + " gender =" + gender + " date_of_birth =" + date_of_birth);
				
				patients pt = new patients(id,name,address,gender,date_of_birth);
				ptList.add(pt);

			}

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
			System.out.println("patients from database: "+ptList);
		}

	}

}
