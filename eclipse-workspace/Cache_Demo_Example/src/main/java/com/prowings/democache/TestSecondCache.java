package com.prowings.democache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.prowings.hibernateutils.HibernateUtils;

public class TestSecondCache{
	
    public static void main(String[] args) 
    {
        SessionFactory sessionfactory = HibernateUtils.getSessionFactoryObj();
        Session session1 = sessionfactory.openSession();
        Transaction txn1 = session1.beginTransaction();

        Person person = new Person("Sham", "abc@gmail.com");
        session1.save(person);
        txn1.commit(); // Commit the transaction to persist data

        // Fetch entity in the same session
        Person sham1 = session1.get(Person.class, person.getId());
        System.out.println("First time fetched Sham object: " + sham1);
        
        Person sham2 = session1.get(Person.class, person.getId());
        System.out.println("Second time fetched Sham object: " + sham2);


        // Close the first session
        session1.close();

        // Open a new session
        Session session2 = sessionfactory.openSession();
        Transaction txn2 = session2.beginTransaction();

        // Fetch the same entity in a new session (uses second-level cache)
        Person shamFromSession2 = session2.get(Person.class, person.getId());
        System.out.println("first time Fetched Sham object from second session: " + shamFromSession2);

        Person shamFromSession3 = session2.get(Person.class, person.getId());
        System.out.println("second time Fetched Sham object from second session: " + shamFromSession3);

        txn2.commit();
        session2.close();
    }
}
