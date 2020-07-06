package in.cdac;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class PostService {
	public static boolean createPostJDBC(String post) {
		
		
		
		return false;
	}
	
	public static boolean createPostHBM(String strpost) {
		SessionFactory sessionFactory = HibernateUtil.sessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Post post = new Post();
		post.setPost(strpost);
		post.setDislikeCount(0);
		post.setLikeCount(0);
		
		session.save(post);
		tx.commit();
		session.close();
		
		return true;
	}
	
	public static List<Post> readPostJDBC() {
		return null;
	}
	
	public static List<Post> readPostHBM() {
		
		SessionFactory sessionFactory = HibernateUtil.sessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction txn = session.beginTransaction();
		
		Query query = session.createQuery("SELECT post FROM Post ");
		
		
		List<Post> results = query.getResultList();
		
		txn.commit();
		session.close();
		return results;
	}
	
	
	
	
	
}
