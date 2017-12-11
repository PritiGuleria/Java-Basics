package com.priti.statergy;

/**
 * Created by prguleri on 9/8/2017.
 */

 interface  PaymentStatergy{
     public void pay();
}

class PayPal implements PaymentStatergy{
    @Override
    public void pay() {
        System.out.println("In Payapl  Statergy");

    }
}

class Stripe implements  PaymentStatergy{
    @Override
    public void pay() {
        System.out.println("In stripe Statergy");
    }
}


class Shopping{

     public void payBill(PaymentStatergy statergy){
         statergy.pay();
     }
}

class Client{
    public static void main(String[] args) {
        Shopping shopping = new Shopping();

        shopping.payBill(new Stripe());
    }
}


