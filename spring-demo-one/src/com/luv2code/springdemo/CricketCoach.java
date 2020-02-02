package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	String emailAddress;
	String teamName;
	// add new Fields

	// No arg constructor
	public CricketCoach() {

		System.out.println("Cricket Coach : No arg Constructor");
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {

		this.emailAddress = emailAddress;
		System.out.println("crickeCoach :Inside setter method--- SetEmailAddress ");

	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
		System.out.println("crickeCoach :Inside setter method -- setTeamName");

	}

	// Setter for setting the injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("crickeCoach :Inside setter method ");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Practice pace bowling daily";
	}

	@Override
	public String getDailyFortune() {
		return "You batted well today" + " " + fortuneService.getFortune();
	}

}
