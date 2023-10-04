package ait.homework;

import java.io.Serializable;

public class Product implements Serializable {

    private String name;
    private double price;
    private int quantity;
    private transient int discount;

    public Product(String name, double price, int quantity, int discount) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", discount=" + discount +
                '}';
    }

}
