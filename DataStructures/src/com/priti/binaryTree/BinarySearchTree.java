package com.priti.binaryTree;

/**
 * Created by prguleri on 12/1/2017.
 */
public class BinarySearchTree {
    private  Node root;

    public Node getRoot(){
        return root;
    }

    public BinarySearchTree insert( int val){
        Node newNode = new Node(val);

       if(root==null){
           this.root=newNode;
           return this;
       }
       insertRec(root,newNode);
       return  this;

    }

    private void insertRec(Node latestRoot, Node newNode) {

        if(latestRoot.getVal()>newNode.getVal()){
            if(latestRoot.getLeft()==null){
                latestRoot.setLeft(newNode);
                return;
            }
            else{
                insertRec(latestRoot.getLeft(),newNode);
            }
        }
        else{
            if(latestRoot.getRight()==null){
                latestRoot.setRight(newNode);
                return;
            }
            else{
                insertRec(latestRoot.getRight(),newNode);
            }
        }

    }


}
