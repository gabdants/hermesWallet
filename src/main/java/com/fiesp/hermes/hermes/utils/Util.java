package com.fiesp.hermes.hermes.utils;

import java.util.Date;

public class Util {

    public String getRandomNumber(){
        Date date = new Date();
        long timeMilli = date.getTime();
        String t = Long.toString(timeMilli);

        return t;

    }

}
