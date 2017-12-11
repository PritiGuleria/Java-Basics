package com.priti.Basics;



/**
 * Created by prguleri on 11/1/2017.
 */
public abstract class AbstractTest {
    static {}
    {}
    AbstractTest(){}

    public static final void test(){}


}
class child extends AbstractTest{}

class HJ{
    public static void main(String[] args) {
        AbstractTest t = new child();

    }
}
