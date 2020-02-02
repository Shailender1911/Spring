package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load the spring configuration file

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve the bean from the spring container
		
	Coach theCoach = context.getBean("myCoach",Coach.class );
	
	//call the method on the bean
	
	System.out.println(theCoach.getDailyWorkOut());
	//lets call the new method now
	
	System.out.println(theCoach.getDailyFortune());
	
	// close the context
	context.close();
	}

}
