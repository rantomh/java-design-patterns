package com.rantomah.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class PayrollSystem {

    private final List<PaymentCanal> employees = new ArrayList<>();

    public void subscribe(PaymentCanal canal) {
        employees.add(canal);
    }

    public void unsubscribe(PaymentCanal canal) {
        employees.remove(canal);
    }

    public void paySalaries(double amount) {
        notify(amount);
    }

    private void notify(double amount) {
        employees.forEach(o -> o.update(amount));
    }
}
