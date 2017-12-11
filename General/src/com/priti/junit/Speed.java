package com.priti.junit;

/**
 * Created by prguleri on 11/24/2017.
 */
public class Speed {
    public int speed (int distance, int time){
        if(distance < 0 || time <= 0){
            throw new IllegalArgumentException("distance: " + distance
                    + " time: " + time);
        }
        return distance/time;
    }

    public static int sum(int a,int b){
        return a+b;

    }
}
