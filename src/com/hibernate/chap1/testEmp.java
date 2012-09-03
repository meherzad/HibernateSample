package com.hibernate.chap1;

//import org.hibernate.cfg.AnnotationConfiguration;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class testEmp {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Depreciated
		// AnnotationConfiguration config = new AnnotationConfiguration();

		Configuration config = new Configuration();
		config.addAnnotatedClass(emp.class);
		config.configure("hibernate.cfg.xml"); // Also allowed
												// config.configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
				.applySettings(config.getProperties()).buildServiceRegistry();

		// new SchemaExport(config).create(true, true);//create new table

		SessionFactory factory = config.buildSessionFactory(serviceRegistry); // Resource
		// intensive so
		// minimize use
		Session session = factory.getCurrentSession();
		session.beginTransaction();

		Query query = (Query) session.createQuery("from emp where id=:id");

		query.setParameter("id", 5);
		System.out.println("out put -------->>>>>>>>   ");
		emp objectRetrieve = (emp) query.uniqueResult();
		System.out.println("out put -------->>>>>>>>   "
				+ objectRetrieve.getEmpName());

		/*
		 * emp obj = new emp(); // Transient object // obj.setEmpId(10);
		 * obj.setEmpName("Ale55x"); session.save(obj);
		 */
		session.getTransaction().commit();
	}

}
