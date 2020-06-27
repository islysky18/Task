package com.tobias.HibernateDemo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections.map.HashedMap;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpMain {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("Hibernate-cfg.xml");
		System.out.println("Configuration Object Created Successfully");

		SessionFactory sf = cfg.buildSessionFactory();
		System.out.println("Session Factory Object is Created Successfully");

		Session s = sf.openSession();

		Transaction t = s.beginTransaction();

		Emp e = new Emp();
		e.setId("101");
		e.setName("Tobias");

		
		Map<String,PhoneNumber> map = new HashMap< String,PhoneNumber>();
		
		PhoneNumber ph1 = new PhoneNumber();
		ph1.setPid("11");
		ph1.setNetwork("ATRTEL");
		ph1.setPhonenumber("2838382929");
		
		PhoneNumber ph2 = new PhoneNumber();
		ph2.setPid("13");
		ph2.setNetwork("T-moble");
		ph2.setPhonenumber("0393929393");
		
		
		map.put(e.getId(),ph1);
		map.put(e.getId(),ph2);
	
		e.setPhoneno(map);
		s.persist(e);

		t.commit();

		s.close();

		sf.close();

	}

}
