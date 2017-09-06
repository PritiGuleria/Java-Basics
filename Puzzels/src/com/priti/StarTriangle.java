package com.priti;

/**
 * Created by prguleri on 9/6/2017.
 */
public class StarTriangle {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for(int k=1;k <=(2*i-1);k++){
                System.out.print("*");
            }
                System.out.println(" ");

            }
        }
    }
