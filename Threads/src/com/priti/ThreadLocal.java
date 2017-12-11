package com.priti;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

/**
 * Created by prguleri on 11/13/2017.
public class ThreadLocal {
    SimpleDateFormat simpleD = new SimpleDateFormat("ddmmyy");


public void changeFormat(){

    simpleD = new SimpleDateFormat("mmddyy");
    System.out.println(simpleD);

}



    public static void main(String[] args) {
    ThreadLocal t = new ThreadLocal();
        Thread t1 = new Thread(){
            @Override
            public void run() {
            t.changeFormat();
            }
        };
    }

}
 */
