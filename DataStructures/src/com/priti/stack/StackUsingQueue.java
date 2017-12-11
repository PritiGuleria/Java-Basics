package com.priti.stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by prguleri on 9/19/2017.
 */
public class StackUsingQueue {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;
    private final int size =5;
    private int index;


    public StackUsingQueue(){
        queue1 = new LinkedList<Integer>();
        queue2 = new LinkedList<Integer>();
    }

    public void push(int i){
        if(queue1.size()<=size) {
            queue1.add(i);
            index++;
        }

    }

    public void pop(){
        int val=0;

        while(queue1.size()>1){
            val=queue1.remove();
            queue2.add(val);
        }
        System.out.println(queue1.remove());

        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;


    }

}
