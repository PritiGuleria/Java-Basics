package com.priti.binaryTree;

/**
 * Created by prguleri on 12/1/2017.
 */
public class PostOrder {
    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(25);
        tree.insert(10);
        tree.insert(78);
        tree.insert(32);
        tree.insert(40);
        Node n = tree.getRoot();

        postOrder(n);


    }

    private static void postOrder(Node root) {

        if(root==null){
            return;
        }


        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.println(root.getVal());

    }
}
