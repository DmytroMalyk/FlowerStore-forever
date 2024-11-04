package ua.edu.ucu.apps.demo.flower.decorators;

import ua.edu.ucu.apps.demo.flower.Item;

public class PaperDecorator extends ItemDecorator {
    public Item item;

    @Override
    public double getPrice() {
        return 13 + item.getPrice();
    }

    @Override
    public String getDescription() {
        return item.getDescription() + "\nWrapped in paper";
    }
}
