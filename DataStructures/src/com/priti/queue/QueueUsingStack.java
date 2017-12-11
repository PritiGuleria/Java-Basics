package com.priti.queue;

import java.util.Stack;

/**
 * Created by prguleri on 11/22/2017.
 */
public class QueueUsingStack {
    private Stack<String> s1;
    private Stack<String> s2;

    QueueUsingStack(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void put(String s){
        s1.push(s);
    }

    public String take(){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }

        return s2.pop();
    }

    public static void main(String[] args) {
        QueueUsingStack q = new QueueUsingStack();
        q.put("Priti1");
        q.put("Priti2");
        q.put("Priti3");
        q.put("Priti4");
        System.out.println(q.take());
        System.out.println(q.take());
        System.out.println(q.take());
        System.out.println(q.take());
    }
}
