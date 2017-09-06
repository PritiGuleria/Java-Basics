package com.priti.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by prguleri on 8/19/2017.
 */
public class CustomBlockingQueue {

    private Queue<String> queue;
    private int size;

    CustomBlockingQueue(){
        queue= new LinkedList<>();
    }
    public synchronized void put(String item) throws InterruptedException {
        while(queue.size()==size){
            wait();
        }
        queue.add(item);
        notifyAll();
    }

    public  synchronized  String take() throws InterruptedException {

        while(queue.size()==0){
            wait();
        }
        String item= queue.remove();
        notifyAll();
        return item;
    }

    public static void main(String[] args) {
        System.out.println("Priti");
    }
}
