package com.cks.springdemo;

public class MyApp {
  public static void main(String[] args) {
    // create object
    Coach b = new CricketCoach() ;
    Coach theCoach = new TrackCoach();
    // use object
    System.out.println(theCoach.getDailyWorkout());
  }
}
