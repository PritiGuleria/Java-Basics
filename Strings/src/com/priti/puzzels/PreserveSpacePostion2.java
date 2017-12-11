package com.priti.puzzels;

/**
 * Created by prguleri on 10/31/2017.
 */
public class PreserveSpacePostion2
{

    public static void main(String[] args) {

        String s = "  Hi I am Priti";

        char[] arr = s.toCharArray();

        int start=0;
        int end =s.length()-1;

        while (start<end){
            while(arr[start]==' '){
                start++;
            }
            while(arr[end]==' '){
                end --;
            }

            char c = arr[start];
            arr[start] = arr[end];
            arr[end] = c;
            start++;
            end--;
        }

        System.out.print(arr);


    }
}
