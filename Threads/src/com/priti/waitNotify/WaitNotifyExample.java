package com.priti.waitNotify;

/**
 * Created by prguleri on 11/3/2017.
 */
public class WaitNotifyExample {
    public synchronized  void method1(){
        System.out.println("Thread is: "+ Thread.currentThread().getId());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Waiting now and giving lock to other thread");
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("wait over");
    }
    public synchronized void method2(){
        System.out.println("starting methiod 2");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("work done notifying waiting party");
        notify();

    }

    public static void main(String[] args) {
        WaitNotifyExample example = new WaitNotifyExample();
        Thread t1 = new Thread(){
            @Override
            public void run() {
                example.method1();
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                example.method2();
            }
        };
        t1.start();t2.start();
    }

}
