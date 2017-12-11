package com.priti;

/**
 * Created by prguleri on 9/7/2017.
 */
public class ThreadInterupptExample {

    public void doSomething(){
        System.out.println("Running Thread "+Thread.currentThread().getId());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }

    public static void main(String[] args) {
        ThreadInterupptExample threadInterupptExample = new ThreadInterupptExample();
        Thread t1 = new Thread(){
            public void run(){
                threadInterupptExample.doSomething();
            }
        };

        t1.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.interrupt();
    }

}
