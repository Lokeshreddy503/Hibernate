package Test;

import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import collection.First;
import collection.Second;


public class Client 
{
	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure("mapping/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		First first = new First();
		Second second = new Second();
		first.setId(111);
		first.setName("lokesh");
		
		
		second.setEmail("lokesh43@gnail.com");
		second.setMarks(100);
		session.persist(first);
		session.persist(second);
		
		transaction.commit();
		
		session.close();
		System.out.println("operations done :)");
		
		
	}

}
