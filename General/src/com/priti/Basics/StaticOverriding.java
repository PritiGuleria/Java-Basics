package com.priti.Basics;

/**
 * Created by prguleri on 11/28/2017.
 */
public class StaticOverriding {

    public  StaticOverriding(){}

    public static void method1(){
        System.out.println("Class parent");
    }


}

class BD extends StaticOverriding{

    public static void method1(){
        System.out.println("class child");
    }

}

class Test{
    public static void main(String[] args) {
        StaticOverriding obj = new BD();
        obj.method1();

    }
}
