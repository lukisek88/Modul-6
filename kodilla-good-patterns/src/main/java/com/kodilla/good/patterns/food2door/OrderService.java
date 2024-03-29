package com.kodilla.good.patterns.food2door;

import java.util.List;

public class OrderService {

    public void processAllOrders(List<OrderRequest> orderRequest) {

        orderRequest.stream()
                .map(n -> {
                    System.out.println("We're processing your order " + n.getCustomer().getCustomerName());
                    return n.getFoodProducer().process(n.getCustomer(), n.getProductOrderRequest());
                })
                .forEach(t -> System.out.println("Order finished with success: " + t + "\n"));
    }
}