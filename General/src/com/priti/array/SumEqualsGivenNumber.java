package com.priti.array;

import java.util.Arrays;

/**
 * Created by prguleri on 12/1/2017.
 */
public class SumEqualsGivenNumber {
    public static void main(String[] args) {

        int[] arr  = new int[]{4,6,5,-10,8,5,20};
        int sum = 12;

        Arrays.sort(arr);

        int start=0;
        int end =arr.length-1;

        while(start<end){
            if(arr[start]+arr[end]==sum){
                System.out.println("( "+arr[start]+" , "+arr[end]+" )");
                start++;
                end--;
            }

            if(arr[start]+arr[end]>sum){
                end--;
            }
            if(arr[start]+arr[end]<sum)
            {
                start++;
            }

        }
    }
}
