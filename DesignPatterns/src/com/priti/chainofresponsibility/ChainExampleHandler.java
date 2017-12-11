package com.priti.chainofresponsibility;

/**
 * Created by prguleri on 10/4/2017.
 */
public class ChainExampleHandler {
    private DispenseChain c;

    public ChainExampleHandler(){
        c= new Rs50Dispenser();
        DispenseChain c1 = new Rs20Dispenser();
        DispenseChain c2 = new Rs10Dispenser();

        c.setNextChain(c1);
        c1.setNextChain(c2);
    }


    public static void main(String[] args) {
        ChainExampleHandler handler = new ChainExampleHandler();

        handler.c.dispense(150);
    }


}
