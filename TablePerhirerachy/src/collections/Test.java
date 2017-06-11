package collections;

import org.hibernate.*;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;

public class Test {

	public static void main(String[] args) 
	{
		try
		{
			Session session = new Configuration().configure("collections/hibernate.cfg.xml").buildSessionFactory().openSession();

			Transaction transaction = session.beginTransaction();
			Lokesh lokesh = new Lokesh();
			//lokesh.setId(111);
			lokesh.setName("raju");
			Lokesh1 lokesh1 = new Lokesh1();
			//lokesh1.setId(222);
			lokesh1.setName("lokesh");
			lokesh1.setEmail("abc@gmail.com");
			lokesh1.setPhoneNumber("99999999");
			Lokesh2 lokesh2 = new Lokesh2();
			//lokesh2.setId(333);
			lokesh2.setName("dileep");

			lokesh2.setAddress("19-8-82/b2");
			lokesh2.setGender("male");
			session.persist(lokesh);
			session.persist(lokesh1);
			session.persist(lokesh2);
			transaction.commit();
			session.close();
			System.out.println("operations done :)");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		// TODO Auto-generated method stub




	}

}
