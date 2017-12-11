package com.priti;

import java.util.ArrayList;

/**
 * Created by prguleri on 11/15/2017.
 */
public class A {

    A(int i){
        System.out.println("A");
    }
}
class B extends A{
    B(int i){
        super(i);
        System.out.println("B");
    }

    void method2(ArrayList<String> list){}

    public static void main(String[] args) {
        B b = new B(10);
        b.method2(new ArrayList());

        System.out.println(Integer.parseInt("Priti"));
    }

}
