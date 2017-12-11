package com.priti.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by prguleri on 9/11/2017.
 */
public class QueueTest {

    public void producer(BlockingQueue queue) throws InterruptedException {

        for(int i=0;i<=100;i++){
            queue.put(i);
            Thread.sleep(2000);
            System.out.println("putting value: "+i);
        }

    }

    public void consumer(BlockingQueue queue) throws InterruptedException {


        while (true){
            Thread.sleep(10000);
            System.out.println( "Taking Value :"+queue.take());
        }

    }

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer > queue = new ArrayBlockingQueue<Integer>(3);

        QueueTest queueTest = new QueueTest();
        Thread t1 = new Thread(){
            public void run(){
                try {
                    queueTest.consumer(queue);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                try {
                    queueTest.producer(queue);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        t1.start();
        t2.start();


    }
}
