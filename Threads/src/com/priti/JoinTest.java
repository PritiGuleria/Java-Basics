package com.priti;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by prguleri on 11/28/2017.
 */
public class JoinTest {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                System.out.println("Thread 1");
            }
        };

        t1.start();
        System.out.println("In main");
        t1.join();

        System.out.println("test");
    }
}
