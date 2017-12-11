package com.priti.waitNotify;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by prguleri on 11/21/2017.
 */
public class ProducerConsumer {

    public  void produce(BlockingQueue queue) throws InterruptedException {
        for(int i=0;i<10;i++){
            Thread.sleep(2000);
            queue.put(i);
        }
    }

    public void consume(BlockingQueue queue) throws InterruptedException {
        for(int i=0;i<10;i++){
            Thread.sleep(5000);
            queue.take();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ProducerConsumer pc = new ProducerConsumer();
        BlockingQueue queue = new BlockingQueue();
        Thread t1 = new Thread(){
            @Override
            public void run() {
                try {
                    pc.produce(queue);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                try {
                    pc.consume(queue);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t1.start();t2.start();


    }

}
class BlockingQueue{
    private Queue<Integer>  q = new LinkedList<>();
    private int limit=3;

    public synchronized void put(int val) throws InterruptedException {
        System.out.println("in put");
        if(q.size()==limit){
            System.out.println("Queue is full");
            wait();
        }
        q.add(val);
        System.out.println("Adding val "+val);
        notify();
    }

    public synchronized  void take() throws InterruptedException {
        System.out.println("in take");
        if(q.size()==0){
            System.out.println("Queue is empty");
            wait();
        }
        System.out.println("Taking val "+q.remove());
        notify();
    }
}
