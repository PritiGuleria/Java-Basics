package com.priti;

/**
 * Created by prguleri on 9/7/2017.
 */
public class ThreadBasics {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(){
            public void run(){

                for(int i=0;i<=100;i++){
                System.out.println("Thread 1 start"+i);
                }
                System.out.println("Thread 1 stops");
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for(int i=101;i<=200;i++){
                    System.out.println("Thread 2 start"+i);
                }
                System.out.println("Thread 2 stops");
            }
        };

        Thread t3 = new Thread(){
            public void run(){

                try {
                    sleep(9000);
                    t2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for(int i=201;i<=300;i++){
                    System.out.println("Thread 3 start"+i);
                }
                System.out.println("Thread 3 stops");
            }
        };


        t3.start();



        System.out.println("Main ends");
    }
}
