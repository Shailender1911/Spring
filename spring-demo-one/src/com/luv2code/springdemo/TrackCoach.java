package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach() {
	}

	@Override
	public String getDailyWorkOut() {
		return "Run everyday";
	}

	public TrackCoach(FortuneService fortuneService) {

		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {

		return "Just Do it :" + fortuneService.getFortune();
	}

}
