package com.priti.list;

import java.util.Arrays;

/**
 * Created by prguleri on 9/14/2017.
 */
public class CustomArrayList {
    private String[] data;
    private int index;


    public CustomArrayList(){
        this.data =new String[6];
    }

    public void add(String val){
        if(data.length-index<5){
            System.out.println(index);
            resizeArr();
        }

        data[index] =val;
        index++;
    }

    private void resizeArr() {
        System.out.println("Resizing");
        data = Arrays.copyOf(data,data.length*2);
    }

    public void remove(String val){
        for(int i=0;i<data.length;i++){
            if(data[i]==val){
                removeByIndex(i);
            }
        }

    }

    private void removeByIndex(int i) {
        int temp =i;

        while(temp<index){
            data[temp]= data[temp+1];
            data[temp+1] = null;
            temp++;
        }
        index--;

    }


    public void traverse(){
        int start =0;
        while (start<index){
            System.out.println(data[start]);
            start++;
        }
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();

        list.add("Priti");
        list.add("Priti1");
        list.add("Priti2");



        list.traverse();


    }

}
