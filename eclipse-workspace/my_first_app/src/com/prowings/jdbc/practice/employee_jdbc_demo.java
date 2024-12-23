package com.prowings.jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class employee_jdbc_demo {

	public static void main(String[] args) {

		Connection con = null;
		List<employee_data_new> emplList = new ArrayList<>();

		// step1 : register the driver class

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// step2: create the connection object

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Shwetatech@8805");

			// step3: create statement/prepared Statement object

			Statement stmt = con.createStatement();
			// step4: execute query using statement object
			ResultSet rs = stmt.executeQuery("select * from employee_data_new");

			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				long salary = rs.getLong(4);
				String department = rs.getString(5);

				System.out.println("fetched row from database :" + "id =" + id + " name =" + name + " age =" + age
						+ " salary =" + salary + " "
								+ "deparment =" + department);
				
				employee_data_new emp = new employee_data_new(id,name,age,salary,department);
				emplList.add(emp);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("some error111 occures during connection to database" + e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("some error222 occures during connection to database" + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("some error occured" + e.getMessage());
		}

		// step5: close the connection
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("employee's from DB :"+emplList);
		}
	}
}
