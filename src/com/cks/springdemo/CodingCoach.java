package com.cks.springdemo;

public class CodingCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Make 5 commits today";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
