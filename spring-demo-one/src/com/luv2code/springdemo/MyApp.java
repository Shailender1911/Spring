package com.luv2code.springdemo;

public class MyApp {

	public static void main(String args[]) {
		
		   Coach theCoach = new BaseballCoach(); 
		   Coach tcoach = new TrackCoach();
		  
		  System.out.println(theCoach.getDailyWorkOut()); //
		  System.out.println(tcoach.getDailyWorkOut());
		 	}
	
	
}
