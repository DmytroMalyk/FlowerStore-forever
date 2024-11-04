package ua.edu.ucu.apps.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import ua.edu.ucu.apps.demo.flower.Item;
import ua.edu.ucu.apps.demo.flower.decorators.BasketDecorator;

class BasketDecoratorTest {
    private Item item;

    @BeforeEach
    void setUp() {
        item = new Item() {
            @Override
            public double getPrice() {
                return 10;
            }

            @Override
            public String getDescription() {
                return "Basic item";
            }
        };
    }

    @Test
    void testGetPrice() {
        Item decoratedItem = new BasketDecorator();
        ((BasketDecorator) decoratedItem).item = item;
        assertEquals(14, decoratedItem.getPrice(), 0.01);
    }

    @Test
    void testGetDescription() {
        Item decoratedItem = new BasketDecorator();
        ((BasketDecorator) decoratedItem).item = item;
        assertEquals("Basic item\nIn a basket", decoratedItem.getDescription());
    }
}
