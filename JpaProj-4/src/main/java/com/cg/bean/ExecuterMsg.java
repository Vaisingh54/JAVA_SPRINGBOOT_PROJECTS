package com.cg.bean;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class ExecuterMsg {

	public static void main(String[] args) {
	
		
		StandardServiceRegistry sr= new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		
		Metadata meta=new MetadataSources(sr).getMetadataBuilder().build();
		
		SessionFactory fact=meta.getSessionFactoryBuilder().build();
		
		Session se=fact.openSession();
		se.beginTransaction();
		Transaction trx=se.getTransaction();
		try {
			
			Employee emp=new Employee(101, "Vaibhav");
			Certifications cer=new Certifications(12, "JAVA C++", emp);
			
			se.persist(cer);
			trx.commit();
			se.close();
			
		} catch (Exception e) {
			trx.rollback();
			e.printStackTrace();
			
		}
		
	}

}
