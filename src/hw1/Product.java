package hw1;

import java.util.HashSet;
import java.util.function.IntFunction;

public class Product {
    private final int cost;
    private final int requiredAmount;

    private final String name;

    public Product(int cost, int requiredAmount, String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            throw new RuntimeException("Заполните карточку товара полностью");
        } else {
            this.name = name;
        }
        this.cost = cost;
        this.requiredAmount = requiredAmount;
        if (cost <=0 || requiredAmount <= 0) {
            throw new RuntimeException("Заполните карточку товара полностью");
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
