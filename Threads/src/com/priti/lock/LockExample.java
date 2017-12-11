package com.priti.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by prguleri on 9/7/2017.
 */
public class LockExample {
   static Lock lock = new ReentrantLock( true);
   static CustomLockExample lockExample = new CustomLockExample();

    public static void doSomething() throws InterruptedException {

        lockExample.lock();
        System.out.println(Thread.currentThread().getId()+" is taking the lock");
        Thread.sleep(3000);
        again();
        System.out.println("Releasing the lock");
        lockExample.unlock();
    }

    public static void again() throws InterruptedException {
        lockExample.lock();
        System.out.println(Thread.currentThread().getId()+" is taking the lock");
        Thread.sleep(3000);
        System.out.println("Releasing the lock");
        lockExample.unlock();
    }

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(){
            @Override
            public void run() {
                try {
                    LockExample.doSomething();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                try {
                    LockExample.doSomething();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t1.start();
        t2.start();

    }

}
