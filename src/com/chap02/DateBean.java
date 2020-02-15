package com.chap02;

import java.util.*;

public class DateBean {

    private Date currentDate = new Date();

    public static final Random randomGenerator = new Random();

    private int randomNumber = 0;
    /**
     * @return the randomNumber
     */
    public int getRandomNumber() {
        randomNumber = randomGenerator.nextInt();
        return randomNumber;
    }
    public Date getCurrentDate() {
        return currentDate;
    }
    /**
     * @param currentDate the currentDate to set
     */
    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }
}

