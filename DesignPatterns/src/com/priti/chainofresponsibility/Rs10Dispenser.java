package com.priti.chainofresponsibility;

/**
 * Created by prguleri on 10/4/2017.
 */
public class Rs10Dispenser  implements  DispenseChain{
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain c) {
        this.chain = c;

    }

    @Override
    public void dispense(int amnt) {
        if (amnt % 10 != 0) {
            System.out.println("Amount should be in multiple of 10s.");
            return;
        }

        if (amnt >= 10) {
            int num = amnt / 10;
            int remainder = amnt % 10;
            System.out.println(" Dispensing :" + num + " 10 notes");


            if (remainder > 0) {
                this.chain.dispense(remainder);
            }
        } else {
            this.chain.dispense(amnt);
        }

    }
}
