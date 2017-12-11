package com.priti.serialization;

import java.io.*;
import java.net.SocketException;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;

/**
 * Created by prguleri on 11/16/2017.
 */
public class Test implements Cloneable {


    public static void main(String[] args) throws IOException {
        try{ SerializationTest test = new SerializationTest();
        test.setDesg("SE");
        test.setId(123);
        test.setName("Priti");
        String s = "Priti";
        try(FileOutputStream fileOutputStream = new FileOutputStream("test.txt");
        InputStream inputStream = new FileInputStream("test.txt"))
        {
            fileOutputStream.write(s.getBytes());
        DataInputStream inputStream1 = new DataInputStream(inputStream);
        int data = inputStream.available();

        byte [] arr = new byte[data];

        inputStream1.read(arr);
        Thread.sleep(4000);

        System.out.println(new String(arr));}



        }
        catch(InterruptedException|IOException e){

        }







    }
}
