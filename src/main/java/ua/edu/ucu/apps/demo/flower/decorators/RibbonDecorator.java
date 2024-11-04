package ua.edu.ucu.apps.demo.flower.decorators;

import ua.edu.ucu.apps.demo.flower.Item;

public class RibbonDecorator extends ItemDecorator {
    public Item item;

    @Override
    public double getPrice() {
        return 40 + item.getPrice();
    }

    @Override
    public String getDescription() {
        return item.getDescription() + "\nDecorated with a ribbon";
    }
}
