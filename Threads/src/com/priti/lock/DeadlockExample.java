package com.priti.lock;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

import static java.lang.Thread.sleep;

/**
 * Created by prguleri on 9/7/2017.
 */
public class DeadlockExample {
    public synchronized void method1(DeadlockExample d1){
        System.out.println("In Method 1");
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {

            System.out.println("test");

        }
        d1.method2(this);

    }

    public synchronized void method2(DeadlockExample d2){
        System.out.println("In Method 2");
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        d2.method1(this);

    }

    public static void main(String[] args) {
        DeadlockExample example = new DeadlockExample();
        DeadlockExample example1 = new DeadlockExample();
        Thread t1 = new Thread(){
            @Override
            public void run() {
                example.method1(example1);
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                example1.method2(example);
            }
        };

        t1.start();
        t2.start();
        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        ThreadMXBean bean = ManagementFactory.getThreadMXBean();

        long ids[] = bean.findDeadlockedThreads();

        if(ids !=null ){
            System.out.println("Deadlock found");
            ThreadInfo[] info = bean.getThreadInfo(ids);
            for(ThreadInfo info1 :info){
                System.out.println(info1.getLockName());
                System.out.println(info1.getThreadName());
            }
        }
    }


}
