package com.course.kafka.api.request;

import java.util.List;

public class OrderRequest {

    private String orderLocation;
    private String orderCardNumber;
    private List<OrderItemRequest> items;

    public OrderRequest() {}

    public OrderRequest(String orderLocation, String orderCardNumber, List<OrderItemRequest> items) {
        this.orderLocation = orderLocation;
        this.orderCardNumber = orderCardNumber;
        this.items = items;
    }

    public String getOrderLocation() {
        return orderLocation;
    }

    public void setOrderLocation(String orderLocation) {
        this.orderLocation = orderLocation;
    }

    public String getOrderCardNumber() {
        return orderCardNumber;
    }

    public void setOrderCardNumber(String orderCardNumber) {
        this.orderCardNumber = orderCardNumber;
    }

    public List<OrderItemRequest> getItems() {
        return items;
    }

    public void setItems(List<OrderItemRequest> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "orderLocation='" + orderLocation + '\'' +
                ", orderCardNumber='" + orderCardNumber + '\'' +
                ", items=" + items +
                '}';
    }
}
