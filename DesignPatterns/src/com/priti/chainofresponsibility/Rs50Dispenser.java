package com.priti.chainofresponsibility;

/**
 * Created by prguleri on 10/4/2017.
 */
public class Rs50Dispenser implements DispenseChain {
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain c) {
        this.chain = c;

    }

    @Override
    public void dispense(int amnt) {
        if (amnt >= 50) {
            int num = amnt / 50;
            int remainder = amnt % 50;
            System.out.println(" Dispensing :" + num + " 50 notes");

            if (remainder > 0) {
                this.chain.dispense(remainder);
            }
        } else {
            this.chain.dispense(amnt);
        }

    }
}
