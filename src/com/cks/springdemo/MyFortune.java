package com.cks.springdemo;

import java.util.Random;

public class MyFortune implements FortuneService {
    private String[] fortuneArray = {"one", "two", "THREE"};
    @Override
    public String getFortune() {
        int rnd = new Random().nextInt(fortuneArray.length);
        return fortuneArray[rnd];
    }

}
