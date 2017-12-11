package com.priti.binaryTree;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by prguleri on 12/1/2017.
 */
public class Inorder {
    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(25);
        tree.insert(10);
        tree.insert(78);
        tree.insert(32);
        tree.insert(40);
        Node n = tree.getRoot();

        inorderTraverse(n);


    }

    private static void inorderTraverse(Node root) {

        if(root==null){
            return;
        }

        inorderTraverse(root.getLeft());
        System.out.println(root.getVal());
        inorderTraverse(root.getRight());

    }
}
