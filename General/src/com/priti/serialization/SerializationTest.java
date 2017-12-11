package com.priti.serialization;

import java.io.*;

/**
 * Created by prguleri on 9/11/2017.
 */
public class SerializationTest implements Serializable{

   private String name;
   private int id;
   private String desg;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesg() {
        return desg;
    }

    public void setDesg(String desg) {
        this.desg = desg;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializationTest test = new SerializationTest();
        test.setDesg("SE");
        test.setId(123);
        test.setName("Priti");
        FileOutputStream file = new FileOutputStream("MyFile.txt");

        ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(test);
        out.flush();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("MyFile.txt"));

        SerializationTest test1 = (SerializationTest)in.readObject();
        in.close();


    }
}



