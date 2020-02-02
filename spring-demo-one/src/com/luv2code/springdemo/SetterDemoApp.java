package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		//load the Spring Config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from the spring container 
		CricketCoach theCoach =  context.getBean("myCricketCoach",CricketCoach.class);
		// call method on bean
		
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getDailyFortune());
		
		//calling the new method for the defined literals
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeamName());
		//close the context	
		
		
	}

}
