package com.cks.springdemo;

public class CodingCoach implements Coach {
    private FortuneService fortuneService;

    public CodingCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Make 5 commits today";
    }

    @Override
    public String getDailyFortune() {
        return "from coding " + fortuneService.getFortune();
    }
}
