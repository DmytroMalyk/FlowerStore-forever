package ua.edu.ucu.apps.demo.flower.decorators;

import ua.edu.ucu.apps.demo.flower.Item;

public class BasketDecorator extends ItemDecorator {
    public Item item;

    @Override
    public double getPrice() {
        return 4 + item.getPrice();
    }

    @Override
    public String getDescription() {
        return item.getDescription() + "\nIn a basket";
    }
}
