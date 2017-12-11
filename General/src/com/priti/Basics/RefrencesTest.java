package com.priti.Basics;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * Created by prguleri on 10/31/2017.
 */
public class RefrencesTest {
    public static void main(String[] args) {
        X x = new X();
        SoftReference<X> softReference = new SoftReference<X>(x);
        WeakReference<X> weakReference = new WeakReference<X>(x);
        ReferenceQueue<X> referenceQueue = new ReferenceQueue<>();
        PhantomReference<X> phantomReference = new PhantomReference<X>(x,referenceQueue);

        weakReference.get();
        softReference.get();
        phantomReference.get();
    }

}

class X{

}
