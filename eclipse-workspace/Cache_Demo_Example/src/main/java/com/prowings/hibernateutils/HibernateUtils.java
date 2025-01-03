package com.prowings.hibernateutils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	
	static SessionFactory sessionfactory = null;

	public static SessionFactory getSessionFactoryObj() {
		
		if (sessionfactory == null) {
			System.out.println("creating session factory object");
			SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
			return sessionfactory;
		}

		else {
			System.out.println("sessionfactory is already initialized");
			return sessionfactory;
		}
		
		
	}

}
