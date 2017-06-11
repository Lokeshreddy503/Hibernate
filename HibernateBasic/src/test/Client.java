package test;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import Beans.Student;;

public class Client {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		Configuration cfg=new Configuration();  
	    cfg.configure("resources/hibernate.cfg.xml");//populates the data of the configuration file  
	      
	    //creating seession factory object  
	    SessionFactory factory=cfg.buildSessionFactory();  
	      
	    //creating session object  
	    Session session=factory.openSession();  
	      
	 Transaction t=session.beginTransaction();  
	 Student st = new Student();
		st.setId(111);
		st.setName("lokesh");
		st.setEmail("sky.lokesh43@gmail.com");
		st.setMarks(100);

	
		session.persist(st);//persisting the object  
	      
	    t.commit();//transaction is commited  
	    session.close();  
	      
	    System.out.println("successfully saved");  
	}

}
