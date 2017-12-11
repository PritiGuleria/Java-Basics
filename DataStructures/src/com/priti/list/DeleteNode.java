package com.priti.list;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by prguleri on 9/19/2017.
 * Delete a node when only pointer to that node is given
 */
public class DeleteNode {

    public static void delete(Node n) {
        Node prev = n;
        int i = 0;
        while (n != null) {
            if (n.getNextnode() == null) {
                prev.setNextnode(null);
                return;
            }
            prev = n;
            n.setValue(n.getNextnode().getValue());
            n = n.getNextnode();


        }

    }

}
