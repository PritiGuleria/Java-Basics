package com.priti.exceptions;

/**
 * Created by prguleri on 11/17/2017.
 */
public class TryCatchTest {
    public static void main(String[] args) {
        try{
            System.out.println("In try");
            System.exit(1);
        }
        catch(Exception e){
            System.out.println("In catch");
        }
        finally{
            System.out.println("In finally");
        }
    }
}
