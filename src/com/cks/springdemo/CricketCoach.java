package com.cks.springdemo;

public class CricketCoach implements Coach {


    private String emailAddress;
    private String team;

    public void setEmailAddress(String emailAddress) {
        System.out.println("Cricket: inside email setter");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("Cricket: inside team setter");

        this.team = team;
    }

    private FortuneService fortuneService;
    // create no arg constructor

    public CricketCoach() {
        System.out.println("Inside no-arg constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside  setter - setFortuneService");

        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Do Cricket for 4 min";
    }

    @Override
    public String getDailyFortune() {
        return "from Cricket " + fortuneService.getFortune();
    }
}