package collection;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CurdTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Session session  = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
         Transaction transaction = session.beginTransaction();
         Curd curd = new Curd();
         curd.setId(999);
         curd.setEmail("xyx@gmail.com");
         curd.setFname("lokesh");
         session.saveOrUpdate(curd);
         transaction.commit();
         session.close();
         System.out.println("operations done");
         
	}

}
