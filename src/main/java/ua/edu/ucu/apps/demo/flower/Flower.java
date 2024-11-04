package ua.edu.ucu.apps.demo.flower;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Flower extends Item {
    @Id
    @Getter
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;

    public Flower(Flower flower) {
        this.color = flower.color;
        this.flowerType = flower.flowerType;
        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
    }

    public String getColor() {
        return color!=null? color.toString(): "null";
    }

    public String getFlowerType() {
        return flowerType!=null? flowerType.toString(): "null";
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return String.format("Flower [Color: %s, Type: %s, Price: %.2f, Sepal Length: %.2f cm]", 
        getColor(), getFlowerType(), price, sepalLength);
    }
}
