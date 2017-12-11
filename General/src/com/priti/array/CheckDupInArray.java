package com.priti.array;

/**
 * Created by prguleri on 11/23/2017.
 */
public class CheckDupInArray {
    public static void main(String[] args) {
        String s = "HHkjkkhm ";
        s= s.toLowerCase();

        char[] arr= s.toCharArray();

        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                if(arr[i]==arr[j]){
                    arr[j]= ' ';

                }
            }
        }

        int count=0;
        for(int i=0;i<s.length()-1;i++){
            while(arr[i]==' '&& count<s.length()){
                count++;
                for(int j=i;j<s.length()-1;j++){
                arr[j]= arr[j+1];
                }

            }
        }


            System.out.println(arr);

    }
}
