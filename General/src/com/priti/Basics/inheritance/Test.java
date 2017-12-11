package com.priti.Basics.inheritance;

/**
 * Created by prguleri on 10/30/2017.
 */
public class Test
{

    int i=9;

    static void testMethod(){
        System.out.println("In Parent");
        //System.out.println(i);
    }

    @Override
    protected void finalize() throws Throwable
    {
        System.out.println("From Finalize Method");
    }
}

class Child extends Test{
    int i=10;
   static void testMethod(){
        System.out.println("In child");
        //System.out.println(i);
    }
}

class Main{
    public static void main(String[] args) throws Throwable {
        Test test = new Child();
        Test test1 = new Child();

        test =test1;
        String  s = new String("PritiGffuleria");
        String s1 = "PritiGulderia";
        System.out.println("jfhjd "+s.compareTo(s1));
        String s2 = new String ("PritiGuleria");
        String s3 = "PritiGuleria";

        System.out.println(s==s1);
        System.out.println(s1==s2);
        System.out.println(s1==s3);



        System.out.println(test.i);
        Test.testMethod();
        System.gc();
         //Runtime.getRuntime().gc();
        Runtime.getRuntime().runFinalization();

        System.out.println("Done");
    }
}
