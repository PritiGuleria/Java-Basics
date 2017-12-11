package com.priti.stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by prguleri on 9/21/2017.
 */
public class StackUsingSingleQueue {
    private Queue<Integer> q1;

    public StackUsingSingleQueue (){
        q1 = new LinkedList<>();
    }

    public void push(int val){
        int size =q1.size();
        q1.add(val);

        for(int i=0; i<size;i++){
            int temp = q1.remove();
            System.out.println("Removing:"+temp);
            q1.add(temp);
        }

    }

    public void pop(){


        System.out.println(q1);System.out.println(q1.remove());
    }


    public static void main(String[] args) {
        StackUsingSingleQueue stackUsingSingleQueue = new StackUsingSingleQueue();
        stackUsingSingleQueue.push(4);
        stackUsingSingleQueue.push(3);
        stackUsingSingleQueue.push(2);
        stackUsingSingleQueue.push(1);

        stackUsingSingleQueue.pop();

    }

}
