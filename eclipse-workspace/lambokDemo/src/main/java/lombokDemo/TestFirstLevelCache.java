package lombokDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.prowings.utils.HibernateUtils;

public class TestFirstLevelCache {

	public static void main(String[] args) {

		SessionFactory sessionfactory = HibernateUtils.getSessionFactoryObj();
		Session session1 = sessionfactory.openSession();
		Transaction txn1 = session1.beginTransaction();

		Person person = new Person("Sham", "Dubai");
		session1.save(person);

		Person Sham1 = session1.get(Person.class, 1L);
		System.out.println("First time fetched Sham object: " + Sham1);

		Person Sham2 = session1.get(Person.class, 1L);
		System.out.println("Second time fetched Sham object: " + Sham2);

		txn1.commit();
		session1.close();
		
		Session session2 = sessionfactory.openSession();
		Transaction txn2 = session2.beginTransaction();
		

		Person nameFromSession2 = session2.get(Person.class, 1L);
		System.out.println("First time fetched Sham object from session2: " +nameFromSession2);

		txn2.commit();
		session2.close();
		

	}

}
