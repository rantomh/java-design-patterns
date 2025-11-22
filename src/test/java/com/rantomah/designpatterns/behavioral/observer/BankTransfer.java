package com.rantomah.designpatterns.behavioral.observer;

public class BankTransfer implements PaymentCanal {

    @Override
    public void update(double amount) {
        System.out.println(String.format("Sending %.2f USD via BankTransfer", amount));
    }
}
