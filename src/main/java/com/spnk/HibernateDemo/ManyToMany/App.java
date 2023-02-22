package com.spnk.HibernateDemo.ManyToMany;

import org.hibernate.SessionFactory;

public class App {
	public static void main(String[] args) {
		SessionFactory sessionFactory=HibernateUtil.geSessionFactory();
		
		System.out.println(sessionFactory);
		sessionFactory.close();
		
	}
}
