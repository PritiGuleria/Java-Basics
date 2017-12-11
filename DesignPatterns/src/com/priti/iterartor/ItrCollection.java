package com.priti.iterartor;

import java.util.Iterator;

/**
 * Created by prguleri on 9/14/2017.
 */
public class ItrCollection {
    private String[] col;
    private int actSize;

    public ItrCollection() {
        col = new String[5];
    }

    public void add(String val) {
        if (actSize < col.length) {
            col[actSize] = val;
            actSize++;
        }
        else{
            System.out.println("Collection is full");
        }
    }

    public String remove(int index) {

        if(index<col.length){
            String temp = col[index];

            col[index]= null;
            while(index < actSize){
                col[index] =col[index+1];
                col[index+1] =null;
                index++;
            }
            actSize--;
            return temp;
        }
        return  null;

    }
    public Itr getIterartor() {
        return new Itr();
    }

    private  class Itr  implements Iterator{
        int index;
        public boolean hasNext(){
            return index < actSize;

        }

        public String next(){

           return col[index++];
        }


    }


}
