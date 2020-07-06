package in.cdac;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HibernateRegisterService {
	
	public static void registerUser(User user) throws Exception {
		
		SessionFactory sessionFactory = HibernateUtil.sessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction txn = session.beginTransaction();
		
		session.save(user);
		
		txn.commit();
		session.close();
		
	}

}
