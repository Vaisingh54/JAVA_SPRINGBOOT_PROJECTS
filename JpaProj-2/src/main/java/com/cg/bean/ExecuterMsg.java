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
			
			//Message mm1=new Message(146, "NAME");
			//Message mm2=new Message(147, "IS NOT VAIBHAV");
			
			
			Message m=se.get( Message.class,145);
			Message m1=se.get( Message.class,146);
			Message m2=se.get( Message.class,147);
			System.out.println(m+"\n"+m1+"\n"+m2);
			trx.commit();
			se.close();
			
		} catch (Exception e) {
			trx.rollback();
			e.printStackTrace();
			
		}
		
	}

}
