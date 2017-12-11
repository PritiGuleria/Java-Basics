package com.priti.puzzels;

/**
 * Created by prguleri on 11/18/2017.
 */
public class RecursionTest {

    static  void check(int n){
        if(n<1){
            return;
        }
        check(n-1);
        if(n%2==0){
            System.out.println("Its even "+n);
        }
        else{
            System.out.println("Its odd " +n);
        }
    }

    public static void main(String[] args) {
        check(10);
    }
}
