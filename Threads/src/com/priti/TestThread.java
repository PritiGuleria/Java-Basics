package com.priti;

/**
 * Created by prguleri on 11/3/2017.
 */
public class TestThread {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Starts");
        Thread t1 = new Thread(){


            @Override
            public void run() {
                System.out.println("Thread 1 starts");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for(int i=0;i<1000;i++){
                    System.out.println(i);
                }
            }
        };

        t1.start();
        t1.join();
        System.out.println("Main is going to sleep");
        Thread.sleep(4000);
        System.out.println("Main ends");
    }
}
