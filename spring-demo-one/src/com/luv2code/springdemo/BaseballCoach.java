package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;

	
	public BaseballCoach() {
	}
	public String getDailyWorkOut() {
		return "Do at least 100 push ups daily";
	}

	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		return "Today is your lucky day";
	}

}
