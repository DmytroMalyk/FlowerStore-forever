package ua.edu.ucu.apps.demo.flower;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FlowerBucket extends Item {
    private List<FlowerPack> flowerPacks;

    public FlowerBucket() {
        this.flowerPacks = new ArrayList<FlowerPack>();
    }

    public void addFlowerPack(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public double getPrice() {
        double price = 0;
        for (FlowerPack el : flowerPacks) {
            price += el.getPrice();
        }
        return price;
    }

    @Override
    public String getDescription() {
        StringBuilder description = new StringBuilder("Flower Bucket contains:\n");
        for (FlowerPack pack : flowerPacks) {
            description.append(String.format("- %d of %s flowers\n", pack.getQuantity(), pack.getFlower().getFlowerType()));
        }
        description.append(String.format("Total Price: %.2f", getPrice()));
        return description.toString();

    }
}
