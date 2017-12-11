package com.priti.array;

/**
 * Created by prguleri on 11/23/2017.
 */
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = new int[] {7, 3, 2, 1, 21, 8};
        int first=0;
        int second =0;

        if(arr[0]>arr[1]){
            first=arr[0];
            second=arr[1];
        }
        else{
            first=arr[1];
            second=arr[2];
        }

        for(int i=2;i<arr.length;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }
            else if( arr[i]>second){
                second=arr[i];
            }
        }

        System.out.println(second);
    }
}
