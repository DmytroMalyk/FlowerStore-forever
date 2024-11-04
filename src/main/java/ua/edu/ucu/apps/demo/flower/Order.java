package ua.edu.ucu.apps.demo.flower;

import java.util.List;

import lombok.Getter;
import ua.edu.ucu.apps.demo.payment.Payment;
import ua.edu.ucu.apps.demo.delivery.Delivery;;

@Getter
public class Order {
    

    private List<Item> items;
    private Delivery delivery;
    private Payment payment;

    public List<Item> getItems() {
        return this.items;
    }

    public double calculateTotalPrice() {
        double sum = 0;
        for (Item el: items) {
            sum += el.getPrice();
        }
        return sum;
    }

    public void setItems(List<Item> newItems) {
        this.items = newItems;
    }

    public Order(List<Item> items, Delivery delivery) {
        this.items = items;
        this.delivery = delivery;
    }
}
