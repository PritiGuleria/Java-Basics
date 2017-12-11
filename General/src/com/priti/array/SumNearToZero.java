package com.priti.array;

/**
 * Created by prguleri on 12/1/2017.
 */
public class SumNearToZero {

    public static void main(String[] args) {
        int[] arr = new int[]{-80,-10,1,60,5,81};

        int start =0;
        int end = arr.length-1;


        int sum =0;
        int min_sum = Integer.MAX_VALUE;
        int min1=0;
        int min2=0;

        while (start<end){
            sum = arr[start]+arr[end];

            if(sum<min_sum){
                min_sum =sum;
                min1=arr[start];
                min2 =arr[end];
            }
            if(sum<0) {
                end--;
            }
            else{
            start++;
            }
        }

        System.out.println(min1  + " "+min2);
    }
}
