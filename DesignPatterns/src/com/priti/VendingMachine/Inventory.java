package com.priti.VendingMachine;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by prguleri on 11/22/2017.
 */
public class Inventory<T> {

    private Map<T, Integer> map = new HashMap<>();

    public void put(T item, Integer quantity){
        map.put(item,quantity);
    }
}
