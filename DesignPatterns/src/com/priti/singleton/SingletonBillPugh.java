package com.priti.singleton;

/**
 * Created by prguleri on 9/8/2017.
 */
public class SingletonBillPugh {


    private SingletonBillPugh() {
    }

    public static SingletonBillPugh getInstance() {
        return InstanceCreater.SINGLETON_BILL_PUGH;
    }

    private static class InstanceCreater {
        private static final SingletonBillPugh SINGLETON_BILL_PUGH = new SingletonBillPugh();
    }
}
