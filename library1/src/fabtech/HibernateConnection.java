package fabtech;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class HibernateConnection {
   
	
  static Session getHibrenateConnection() {
		
		//1. Create Configuration Object
		Configuration config = new Configuration().configure("fabtech/hibernate.cfg.xml");
					
		//2. Create Session Factory Object
		SessionFactory sessionFactory = config.buildSessionFactory();
				
		//3. Open the Session
		Session session = sessionFactory.openSession();
				
		//4. Begin the Transaction
		session.beginTransaction();
												
		return session;
		
	}
	
}
