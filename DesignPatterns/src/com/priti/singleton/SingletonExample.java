package com.priti.singleton;

import java.io.*;

import static java.lang.Thread.sleep;

/**
 * Created by prguleri on 9/8/2017.
 */
public class SingletonExample implements Serializable {
    private static SingletonExample instance;

    private SingletonExample() {
    }

    public static SingletonExample getInstance() {

        if (instance == null) {
            synchronized (SingletonExample.class) {
                if (instance == null) {
                    System.out.println("Creating instance");
                    instance = new SingletonExample();
                }
            }
        }
        return instance;
    }

    public Object readResolve(){
        return instance;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        SingletonExample example = SingletonExample.getInstance();

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("test1.txt"));

        out.writeObject(example);
        out.close();


        ObjectInputStream in = new ObjectInputStream(new FileInputStream("test1.txt"));

        SingletonExample example1 = (SingletonExample)in.readObject();
        System.out.println(example.hashCode());
        System.out.println(example1.hashCode());





    }

}
