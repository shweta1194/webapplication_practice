package com.prowings.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.prowings.utils.HibernateUtils;

public class TestCourse {

	public static void main(String[] args) {

		SessionFactory sessionfactory = HibernateUtils.getSessionFactoryObj();
		Session session = sessionfactory.openSession();
		Transaction txn = session.beginTransaction();
		
		Course course = new Course("Java programming",10,50000);
		Course course2 = new Course("Data Structure",6,40000);
		Course course3 = new Course("Software Testing",5,35000);
		OnlineCourse onlinecourse = new OnlineCourse("Java Programming",10,50000,"Udemy",12);
		OfflineCourse offlinecourse = new OfflineCourse("Data Structure",6,40000,"Pune",10);
		
		session.save(course);
		session.save(course2);
		session.save(course3);
		
		session.save(onlinecourse);
		session.save(offlinecourse);
		txn.commit();
		session.close();
	}

}
