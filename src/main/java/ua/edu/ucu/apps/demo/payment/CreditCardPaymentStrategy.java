package ua.edu.ucu.apps.demo.payment;

import lombok.Getter;
import lombok.Setter;

public class CreditCardPaymentStrategy implements Payment{
    @Getter
    @Setter
    private boolean payed;

    public CreditCardPaymentStrategy() {
        this.payed = false;
    }

    @Override
    public String getPayment() {
        if (!payed) {
            return "Payed with credit card";
        } else {
            return "The bill is already payed";
        }
    }
}
