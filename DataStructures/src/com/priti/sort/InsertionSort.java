package com.priti.sort;

/**
 * Created by prguleri on 11/2/2017.
 */
public class InsertionSort {
    public static void doSort(int[] arr){

   for(int i=0;i<arr.length;i++){
       int key= arr[i];
       int j = i-1;
      while(j>-1 && (key<arr[j])){
           arr[j+1] =arr[j];
           j--;
       }
       arr[j+1] =key;

   }

    }

    public static void main(String[] args) {
        int[] arr = new int[]{12, 11, 13, 5, 6};
        doSort(arr);

        for(int i:arr){
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
