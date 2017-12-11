package com.priti.stack;

/**
 * Created by prguleri on 9/14/2017.
 */
public class StackTest {
    public static void main(String[] args) {
        //StackUsingArray stack = new StackUsingArray();
        //StackUsingQueue stack = new StackUsingQueue();
        StackUsingSingleQueue stack = new StackUsingSingleQueue();
        stack.push(23);
        stack.push(21);
        stack.push(298);
        stack.push(26);
        stack.push(211);

        stack.pop();
        stack.pop();


    }
}
