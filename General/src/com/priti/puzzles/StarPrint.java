package com.priti.puzzles;

/**
 * Created by prguleri on 11/24/2017.
 */
public class StarPrint {

    public static void main(String[] args) {
        int num=5;
        int count=0;

        for(int i=0;i<num;i++){
            for(int j=num;j>i;j--){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
