package com.cg.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class MessageExecuter {

	public static void main(String[] args) {
		StandardServiceRegistry sr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata metadata=new MetadataSources(sr).getMetadataBuilder().build();
		
		SessionFactory factory=metadata.getSessionFactoryBuilder().build();
		
		Session session=factory.openSession();
		session.beginTransaction();
		
		Message msg=new Message(101,"Hello world!!!");
		session.save(msg);
		session.getTransaction().commit();
		session.close();
		

	}

}
