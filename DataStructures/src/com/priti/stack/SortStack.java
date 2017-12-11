package com.priti.stack;

import java.util.Stack;

/**
 * Created by prguleri on 11/17/2017.
 */
public class SortStack {

    public static Stack sortStack(Stack<Integer> stack){
        Stack<Integer> temp = new Stack<>();

        while(!stack.isEmpty()){
            int val = stack.pop();

            while(!temp.isEmpty() && temp.peek()>val){
                stack.push(temp.pop());

            }
            temp.push(val);
        }

        return temp;



    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.add(6);
        stack.add(2);
        stack.add(13);
        stack.add(8);
        stack.add(0);

        stack = sortStack(stack);
        System.out.println(stack);



    }
}
