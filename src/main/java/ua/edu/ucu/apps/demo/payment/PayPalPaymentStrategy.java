package ua.edu.ucu.apps.demo.payment;

import lombok.Getter;
import lombok.Setter;

public class PayPalPaymentStrategy implements Payment{
    @Getter
    @Setter
    private boolean payed;

    public PayPalPaymentStrategy() {
        this.payed = false;
    }

    @Override
    public String getPayment() {
        if (!payed) {
            return "Payed with pay pal";
        } else {
            return "The bill is already payed";
        }
    }
}
