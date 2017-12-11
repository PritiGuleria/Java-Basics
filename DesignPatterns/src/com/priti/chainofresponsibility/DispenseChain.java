package com.priti.chainofresponsibility;

/**
 * Created by prguleri on 10/4/2017.
 */
public interface DispenseChain {
    void setNextChain(DispenseChain c);
    void dispense(int amnt);
}
