package com.kodilla.good.patterns.food2door;

import java.util.Map;

public interface FoodProducent {
    boolean process(Customer customer, Map<Product,Integer> productOrder);
}
