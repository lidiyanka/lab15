package org.example;

class Product {
    protected String name;
    protected int id;
    protected double price;

    public Product(String name, int id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price + " руб.";
    }
}

