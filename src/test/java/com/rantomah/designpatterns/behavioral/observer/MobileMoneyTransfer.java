package com.rantomah.designpatterns.behavioral.observer;

public class MobileMoneyTransfer implements PaymentCanal {

    @Override
    public void update(double amount) {
        System.out.println(String.format("Sending %.2f USD via MobileMoneyTransfer", amount));
    }
}
