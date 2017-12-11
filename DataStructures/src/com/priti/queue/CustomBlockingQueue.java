package com.priti.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by prguleri on 8/19/2017.
 */
public class CustomBlockingQueue {

    private Queue<Integer> queue;
    private int size;

    CustomBlockingQueue() {
        size =3;
        queue = new LinkedList<>();
    }


    public synchronized  void put(int i) throws InterruptedException {
        if(queue.size()==size){
            wait();
        }

        queue.add(i);
        System.out.println("added value :"+i);
        notifyAll();
    }

    public synchronized  void take() throws InterruptedException {
        if(queue.size()==0){
            wait();
        }
        System.out.println("taken value: "+queue.remove());
        notifyAll();

    }

    public int queueSize(){
        return queue.size();
    }

    public boolean isFull(){
        return (queue.size()==size);
    }

    public void  printAll(){
        System.out.println(queue);

    }




    public static void main(String[] args) throws InterruptedException {
        CustomBlockingQueue  queue = new CustomBlockingQueue();

        Thread t1 = new Thread(){
            @Override
            public void run() {

                for(int i=0;i<=10;i++){
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    try {
                        queue.put(i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread t2  = new Thread(){
            @Override
            public void run() {
                try {
                    for (int i=0;i<=10;i++){
                        Thread.sleep(5000);
                    queue.take();}
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        t1.start();t2.start();
        Thread.sleep(5000);
        queue.printAll();

    }
}
