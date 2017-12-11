package com.priti.binaryTree;

/**
 * Created by prguleri on 12/1/2017.
 */
public class PreOrder {

    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(25);
        tree.insert(10);
        tree.insert(78);
        tree.insert(32);
        tree.insert(40);
        Node n = tree.getRoot();

        preOrder(n);


    }

    private static void preOrder(Node root) {

        if(root==null){
            return;
        }

        System.out.println(root.getVal());
        preOrder(root.getLeft());
        preOrder(root.getRight());

    }
}
