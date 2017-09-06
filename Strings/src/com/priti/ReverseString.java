package com.priti;

import java.util.Arrays;

/**
 * Created by prguleri on 9/6/2017.
 */
public class ReverseString {
    public static void main(String[] args) {
        String s = "Priti";

        char[] arr = s.toCharArray();
        int start=0;
        int end =arr.length-1;

      /*  while(start<end){
            char temp =arr[start];
            arr[start] = arr[end];
            arr[end] =temp;
            start++;
            end--;
        }

        for(char c:arr){
            System.out.print(c);
        }*/

      for(int i=start;i<=end;i++){
          for(int j=end;j>=i;j--){
              char temp =arr[i];
              arr[i] = arr[j];
              arr[j] =temp;
              i++;
          }
      }

        for(char c:arr){
            System.out.print(c);
        }
    }
}
