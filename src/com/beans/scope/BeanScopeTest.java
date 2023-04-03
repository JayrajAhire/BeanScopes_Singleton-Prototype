package com.beans.scope;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeTest {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

		// Singleton
		System.out.println("Singleton");
		Person person1 = (Person) applicationContext.getBean("person");
		
		person1.setName("Name2");
		
		System.out.println("Name : " + person1.getName());
		System.out.println("Hascode 1 :"+person1.hashCode());
		
		Person person2 = (Person) applicationContext.getBean("person");
		
		System.out.println("Name : " + person2.getName());
		System.out.println("Hascode 2: "+person2.hashCode());
		
		
		
	
		
		
		System.out.println();
		System.out.println("***********");
		System.out.println("Prototype");
		
		
		// prototype
		
		User user1 = (User) applicationContext.getBean("user");
		
		user1.setName("Name2");
		
		System.out.println("Name : " + user1.getName());
		System.out.println("Hascode 1: "+user1.hashCode());
		
		
		
		
		User user2 = (User) applicationContext.getBean("user");
		
		System.out.println("Name : " + user2.getName());
		System.out.println("Hascode 2: "+user2.hashCode());
		
		//System.out.println(user1 == user2);

		applicationContext.registerShutdownHook();
		applicationContext.close();

	
	}

}
