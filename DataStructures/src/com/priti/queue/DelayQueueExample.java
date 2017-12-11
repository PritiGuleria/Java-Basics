package com.priti.queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;

/**
 * Created by prguleri on 9/12/2017.
 */
public class DelayQueueExample {
    public static void main(String[] args) throws InterruptedException {
        DelayQueueExample example = new DelayQueueExample();
        BlockingQueue<DelayedElement> queue = new DelayQueue<DelayedElement>();


        Thread t1 = new Thread(){
            public void run(){
                try {
                    example.consume(queue);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                try {
                    example.produce(queue);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t1.start();
        t2.start();


    }

    public void produce(BlockingQueue<DelayedElement> queue) throws InterruptedException {
        while (true) {

            if(queue.size()==0){
                return;
            }
            DelayedElement d1 = new DelayedElement("Priti", 2);
            DelayedElement d2 = new DelayedElement("Sohi", 5);
            DelayedElement d3 = new DelayedElement("pallu", 3);
            DelayedElement d4 = new DelayedElement("shobu", 2);
            DelayedElement d5 = new DelayedElement("papa", 6);
            DelayedElement d6 = new DelayedElement("mummu", 9);

            queue.put(d1);
            queue.put(d2);
            queue.put(d3);
            queue.put(d4);
            queue.put(d5);
            queue.put(d6);
        }

    }

    public void consume(BlockingQueue<DelayedElement> queue) throws InterruptedException {
        while(queue.size()!=0){
            System.out.println((DelayedElement)queue.take());
        }

    }
}


