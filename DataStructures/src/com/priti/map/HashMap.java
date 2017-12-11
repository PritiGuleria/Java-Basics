package com.priti.map;

import java.util.Map;

/**
 * Created by prguleri on 11/20/2017.
 */
public class HashMap {

    private MapNode[] bucket;

    public  HashMap(){
        this.bucket = new MapNode[16];

    }

    public void put(String key ,String val){
        if(shouldResize()){
            resizeMap();
        }

        putVal(key,val);
    }

    private boolean shouldResize() {
        return false;
    }

    private void resizeMap() {
        MapNode[] newBucket = new MapNode[bucket.length*2];

        for(MapNode node :bucket){
            MapNode current = node;
            while( current !=null){
                putVal(current.getKey(),current.getValue());
                current= current.getNext();
            }
        }
        bucket = newBucket;
    }

    private void putVal(String key,String val){
        MapNode newVal = new MapNode(key,val);
        int hash = getHashCode(key);

        int index = getIndex(hash);

        insertInBucket(index,newVal);

    }

    private int getIndex(int hash) {
        return (hash%bucket.length);

    }

    private int getHashCode(String key) {

        return ((key.hashCode()%bucket.length)+bucket.length)%bucket.length;

    }

    private void insertInBucket(int index, MapNode newVal) {
        if(bucket[index]==null){
            bucket[index] =newVal;
        }
        else
        {
            MapNode current = bucket[index];
            MapNode prev = bucket[index];
           while (current !=null){
               if(current.getKey().equals(newVal.getKey())){
                   current.setValue(newVal.getValue());
                   return;
               }
               prev=current;
               current = current.getNext();
           }
            prev.setNext(newVal);
        }

    }


    public String  get(String key){

        int hash = getHashCode(key);
        int index = getIndex(hash);

        MapNode current = bucket[index];

        while(current !=null){
            if(current.getKey().equals(key)){
                return current.getValue();
            }
            current=current.getNext();
        }

        System.out.println("Key "+ key+ " does not exist ");
        return null;
    }

    public void  print(){
        for(MapNode node : bucket){
            MapNode current = node;
            while(current !=null){
                System.out.println(current.getKey()+ " "+ current.getValue());
                current= current.getNext();
            }
        }
    }



    private class MapNode {
        private String key ;
        private String value;
        private MapNode next;


        private MapNode(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public MapNode getNext() {
            return next;
        }

        public void setNext(MapNode next) {
            this.next = next;
        }

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }

        public void  setValue(String value){
            this.value = value;
        }
    }

    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put("Priti","1");
        map.put("Priti1","2");
        map.put("Priti2","3");
        map.put("Priti3","4");

        map.print();
        System.out.println("_______________");

        map.put("Priti","new");

        map.print();


    }
}
