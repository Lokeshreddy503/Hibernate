package Test;

import org.hibernate.*;
import org.hibernate.cfg.*;

import collection.First;

public class Client {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Session session = new Configuration().configure("mapping/hibernate.cfg.xml").buildSessionFactory().openSession();
Transaction transaction = session.beginTransaction();
First first = new First();
first.setId(222);
first.setFname("lokesh");
first.setLname("Reddy");
First first1 = new First();
first1.setId(4444);
first1.setFname("lokesh");
first1.setLname("Reddy");

session.persist(first);
session.persist(first1);
transaction.commit();
session.close();
System.out.println("oprations done   :)");

	}

}
