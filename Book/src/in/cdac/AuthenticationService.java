package in.cdac;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

import org.hibernate.Query;

public class AuthenticationService {
	
	public static boolean validateUserJDBC() {
		return false;
	}
	public static boolean validateUserHBM(String username, String password) {
		
		SessionFactory sessionFactory = HibernateUtil.sessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Query query = session.createQuery("FROM User WHERE username=:username and password=:password");
		query.setParameter("username",username);
		query.setParameter("password",password);
		
		List<User> list = query.getResultList();
		
		if(list.size() == 0) {
			return false;
		} else {
			return true;
		}
		
	}
}
