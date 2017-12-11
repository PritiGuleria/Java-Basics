package com.priti.binarySearch;

import java.util.Arrays;

/**
 * Created by prguleri on 10/2/2017.
 */
public class BSExample {
    public static void main(String[] args) {
        int [] arr = new int[]{2,5,65,76,21};
       int present=binarySearch(arr,760);
        System.out.println(present);

    }

    private static int binarySearch(int[] arr,int value) {
      Arrays.sort(arr);

       int first =0;
      int last = arr.length-1;
       return search(arr,first,last,value);
    }

    private static int search( int[] arr,int first, int last,int value) {

        if(first>last){
            System.out.println("test");
            return -1;
        }

        int mid = (first+last)/2;


        if(arr[mid]==value){
            return mid;
        }

        if(value>arr[mid]){
            return search(arr,mid+1,last,value);
        }

        if(value<arr[mid]){
            return search(arr,first,mid-1,value);
        }

        return -1;

    }

}
