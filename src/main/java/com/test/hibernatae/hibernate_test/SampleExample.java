package com.test.hibernatae.hibernate_test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.test.model.EmployeeDetails;

public class SampleExample {

	public static void main(String[] args) {

		
		@SuppressWarnings("deprecation")
		SessionFactory sessionFactory = SessionFactoryHelper.getSessionFactory();
		Session session = sessionFactory.openSession() ;
		
		SampleExample testObj = new SampleExample();
		testObj.create(session);
	}
	
	private void create(Session session) {
		System.out.println("Creating employee records...");
		EmployeeDetails empObj = new EmployeeDetails();
		empObj.setEmpName("Rakesh Pattnaik");
		empObj.setEmpId("9833");
		empObj.setEmpAge(32);
		
		session.beginTransaction();
		session.save(empObj);
		session.getTransaction().commit();
	}
	
	

}
