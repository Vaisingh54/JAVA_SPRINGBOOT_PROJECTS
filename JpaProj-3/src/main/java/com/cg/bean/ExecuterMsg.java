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
			Address add1=new Address("varanasi", "UP", 221108);
			Employee emp=new Employee(101, "Vaibhav", add1);
			se.save(emp);
			
			System.out.println(se.get(Employee.class, 101));
			trx.commit();
			se.close();
			
		} catch (Exception e) {
			trx.rollback();
			e.printStackTrace();
			
		}
		
	}

}
