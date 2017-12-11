package com.priti.Basics;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by prguleri on 9/25/2017.
 */
public class ClassesAndObjects {
    public static void main(String[] args) throws IOException {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy");
        System.out.println(format.format(date));

        String[] s1 = {"ONE", "TWO", "THREE", "FOUR"};

        String[] s2 = {"THREE", "TWO", new String("ONE")};

        System.out.println(s1[0] == s2[2]);

        System.out.println(s1[1] == s2[1]);

        System.out.println(s1[2] == s2[0]);


            B b = new B();

    }
}

class A
{
    static String s = "AAA";

    static
    {
        System.out.println("In A static block");
        s = s + "BBB";
    }

    {
        System.out.println("In A Init block");
        s = "AAABBB";
    }
}

class B extends A
{
    static
    {
        System.out.println("In B static block");
        s = s + "BBBAAA";
    }

    {
        System.out.println("In B Init block");
        System.out.println(s);
    }
}


