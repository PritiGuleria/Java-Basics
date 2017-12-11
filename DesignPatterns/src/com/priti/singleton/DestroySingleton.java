package com.priti.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by prguleri on 9/8/2017.
 */
public class DestroySingleton {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {
        SingletonBillPugh singletonBillPugh = SingletonBillPugh.getInstance();
        SingletonBillPugh s2 = SingletonBillPugh.getInstance();
        SingletonBillPugh singletonBillPugh1 = null;

        Constructor[] constructor = Class.forName("com.priti.singleton.SingletonBillPugh").getDeclaredConstructors();

        for(Constructor c: constructor){
            c.setAccessible(true);
            singletonBillPugh1 = (SingletonBillPugh) c.newInstance();
            break;
        }

        System.out.println(s2.hashCode());
        System.out.println(singletonBillPugh.hashCode());
        System.out.println(singletonBillPugh1.hashCode());
    }

}
