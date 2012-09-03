package com.hibernate.chap1;

//import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
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
		config.configure("hibernate.cfg.xml"); //  Also allowed 		config.configure();

		new SchemaExport(config).create(true, true);

	}

}
