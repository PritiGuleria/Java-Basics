package com.priti.list;

/**
 * Created by prguleri on 11/29/2017.
 */
public class PalindromeList {
   static CustomLinkedList list = new CustomLinkedList();

    public static void main(String[] args) {


        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);


        System.out.println(checkPalindrome(list));



    }

    private static boolean checkPalindrome(CustomLinkedList list) {
        Node current = CustomLinkedList.getHead(list);
        return checkPalindrome(current);
    }
    private static boolean checkPalindrome(Node current){
        list.old= CustomLinkedList.getHead(list);

        if(current ==null){
            return true;
        }

        boolean isp = checkPalindrome(current.getNextnode());
        System.out.println("current: "+current.getValue());
        System.out.println("old: "+list.old.getValue());
        if(!isp){
            return false;
        }

        boolean isp1= (current.getValue()==list.old.getValue());
        list.old =list.old.getNextnode();

        return isp1;

    }
}
