package com.priti.queue.ProducerConsumer;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by prguleri on 12/1/2017.
 */
public class ProducerConsumer2 {
    public static void main(String[] args) {

        Queue<Integer> list = new LinkedList<>();
        Producer p = new Producer(list);
        Consumer c = new Consumer(list);
        p.start();
        c.start();

    }

}


class Producer extends Thread{

    private Queue<Integer> list ;

    Producer(Queue<Integer> list){
        this.list =list;

    }
    public void run()  {

        for(int i=0;i<=10;i++){
            synchronized (list){
                while(list.size()==3){
                    System.out.println("Waiting for queue to be empty");
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                list.add(i);
                System.out.println("Added Val: "+i);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                list.notify();
            }
        }

    }
}

class Consumer extends  Thread{
     private Queue<Integer> list ;

    Consumer(Queue<Integer> list){
        this.list =list;

    }

    public void run()  {

        for(int i=0;i<=10;i++){
            synchronized (list){
                while (list.size()==0){
                    System.out.println("Queue is empty");
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Removed Value: "+list.remove());
                list.notify();
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
