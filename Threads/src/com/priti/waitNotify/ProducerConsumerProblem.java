package com.priti.waitNotify;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by prguleri on 11/21/2017.
 */
public class ProducerConsumerProblem {

    private  Queue<Integer> queue = new LinkedList<>();

    private  int limit =3;

    public  void produce() throws InterruptedException {
        for(int j=0;j<=10;j++) {
            synchronized (this) {
                while (queue.size() == limit) {
                    System.out.println("Queue is full");
                    wait();
                }
                queue.add(j);
                System.out.println("Added val " + j);
                notify();
            }
        }
    }

    public  void consume() throws InterruptedException {
        for(int j=0;j<=10;j++) {
            Thread.sleep(5000);
            synchronized (this) {
                while (queue.size() == 0) {
                    wait();
                }
                System.out.println("Removed val " + queue.remove());
                notify();
            }
        }
    }

    public static void main(String[] args) {
        ProducerConsumerProblem pc = new ProducerConsumerProblem();

        Thread t1 = new Thread(){
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        t1.start();
        t2.start();
    }
}
