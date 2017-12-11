package com.priti.map;

import com.priti.list.CustomLinkedList;

/**
 * Created by prguleri on 10/2/2017.
 */
public class CustomLinkedHashMap {
    private static final int SIZE =16;
    private  MyEntry[] table = new MyEntry[SIZE];
    private MyEntry tHead;
    private MyEntry tLast;

    public void put(String key, String val){
        if(shouldResize()){
            resize();
        }

        insert(key,val);


    }

    private void insert(String key, String val) {

        int hash = calculateHash(key);
        int index = findIndex(hash);

        MyEntry newVal = new MyEntry(key,val);

        updateTraversalInfo(newVal);

        if(table[index] ==null){
            table[index] = newVal;
            return;

        }
        MyEntry current = table[index];
        MyEntry prev = current;

        while (current !=null){
            if(current.getValue().equals(newVal.getValue())){
                current.setValue(newVal.getValue());
                return;
            }
            prev=current;
            current =current.getNext();
        }

        prev.setNext(newVal);



    }

    private void updateTraversalInfo(MyEntry newVal) {
        if(tHead==null){
            tHead = newVal;
            tLast =tHead;
            return;
        }
        tLast.settAfter(newVal);
        newVal.settBefore(tLast);
        tLast = newVal;
    }

    private int calculateHash(String key) {
        return  (Integer.parseInt(key)*10)/4;
    }

    private int findIndex(int hash) {
        return (hash%table.length);
    }

    private void resize() {

        MyEntry[] newTable = new MyEntry[SIZE*2];
        MyEntry [] temp = table;
        table = newTable;

        for(MyEntry entry:temp){
            MyEntry current = entry;

            while (current !=null){
                insert(current.getKey(),current.getValue());
                current =current.getNext();
            }
        }

    }

    private boolean shouldResize() {

        return false;

    }

    public void traverse(){

        MyEntry current = tHead;

        while (current !=null){
            System.out.println(current.getKey()+" "+current.getValue());
            current=current.gettAfter();
        }
    }


    static class MyEntry{
        private String key;
        private String value;
        private MyEntry next;
        private MyEntry tBefore;
        private MyEntry tAfter;

        MyEntry(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public MyEntry gettBefore() {
            return tBefore;
        }

        public void settBefore(MyEntry tBefore) {
            this.tBefore = tBefore;
        }

        public MyEntry gettAfter() {
            return tAfter;
        }

        public void settAfter(MyEntry tAfter) {
            this.tAfter = tAfter;
        }

        public MyEntry getNext() {
            return next;
        }

        public void setNext(MyEntry next) {
            this.next = next;
        }
    }


    public static void main(String[] args) {
        CustomLinkedHashMap map = new CustomLinkedHashMap();

        map.put("1","Priti");
        map.put("2","Priti2");
        map.put("3","Priti3");
        map.put("4","Priti4");

        map.traverse();
    }
}
