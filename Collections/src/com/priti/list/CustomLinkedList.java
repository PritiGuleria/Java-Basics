package com.priti.list;

/**
 * Created by prguleri on 9/5/2017.
 */
public class CustomLinkedList {
    private  Node head;

    public void add(int value){
        Node node = new Node(value);

        if(head!=null) {
            node.setNextnode(head);
        }
            head = node;

    }

    public void remove(int value){
        Node currentNode = head;
        Node prevNode = head;
        if(head.getValue()==value){
            head=head.getNextnode();
            return;
        }

        while(currentNode !=null){
            if(currentNode.getValue()==value){
                prevNode.setNextnode(currentNode.getNextnode());
                return;
            }
            prevNode=currentNode;
            currentNode=currentNode.getNextnode();
        }

    }

    public void removeIndex(int index){
        Node currentNode = head;
        Node prevNode =head;
        int pos=0;

        if(index==0){
            head=head.getNextnode();
            return;
        }

        while(currentNode!=null){
            if(pos==index){
                prevNode.setNextnode(currentNode.getNextnode());
                return;

            }
            prevNode=currentNode;
            currentNode=currentNode.getNextnode();
            pos++;

        }


    }

    public boolean search(int value){
        Node current =head;
        if(current.getValue()==value){
            return true;
        }
        while(current!=null){
            if(current.getValue()==value){
                return true;
            }
            current=current.getNextnode();
        }
        return false;
    }

    public void printAll(){
        Node currentNode =head;
        while(currentNode!=null){
            System.out.println(currentNode.getValue());
            currentNode=currentNode.getNextnode();
        }
    }

    public static void reverseList(CustomLinkedList linkedList){

        Node current = linkedList.head;
        Node next = null;
        Node prev= null;

        while(current!=null){
            next=current.getNextnode();
            current.setNextnode(prev);
            prev = current;
            current=next;

        }
       linkedList.head=prev;

    }

    public  static void createLoop(CustomLinkedList linkedList){
        linkedList.head.getNextnode().setNextnode(linkedList.head);
    }

    public static boolean checkLoop(CustomLinkedList linkedList){
        Node slow = linkedList.head;
        Node fast = linkedList.head;

        while(slow !=null  && fast.getNextnode() !=null){
            slow=slow.getNextnode();
            fast=fast.getNextnode().getNextnode();
            if(fast.getValue()==slow.getValue()){
                return true;
            }


        }

        return false;
    }
}
