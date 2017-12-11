package com.priti.Basics;

import java.lang.ref.SoftReference;

/**
 * Created by prguleri on 9/30/2017.
 */
public class WeakMap {
    public static void main(String[] args) {
        WeakMap m = new WeakMap();
        SoftReference<WeakMap> soft = new SoftReference<WeakMap>(m);
        WeakMap resurectmap = soft.get();
    }
}
