package com.prowings.jdbc.practice;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class books_jdbc_demo {

	static Connection con = null;
	static List<books> bkList = new ArrayList<>();

	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");

		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "Shwetatech@8805");
		
          Statement stmt = con.createStatement();
		
		   ResultSet rs = stmt.executeQuery("select * from books");
		
		while(rs.next())
		{
			int book_id = rs.getInt("book_id");
			String title = rs.getString("title");
			String author = rs.getString("author");
			String publisher = rs.getString("publisher");
			Date published_date =rs.getDate("published_date");
			int price = rs.getInt("price");
			
			System.out.println("fetched row from database :" + "book_id =" + book_id + " title =" + title + " author =" + author
					+ " publisher =" + publisher + " "
							+ "published_date =" + published_date + " price ="+price);
			
			books bk = new books(book_id,title,author,publisher,published_date,price);
			bkList.add(bk);
		
		}
		}
		catch (ClassNotFoundException e) {
			System.out.println("some error111 occures during connection to database" + e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("some error222 occures during connection to database" + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("some error occured" + e.getMessage());
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("employee's from DB :"+bkList);

   }
}

