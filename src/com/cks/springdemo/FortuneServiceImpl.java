package com.cks.springdemo;

public class FortuneServiceImpl implements FortuneService {
    @Override
    public String getFortune(){
      return "today is your lucky day";
    }
}
