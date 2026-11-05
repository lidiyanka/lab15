package org.example;

class Clothing extends Product {
    private String size;

    public Clothing(String name, int id, double price, String size) {
        super(name, id, price);
        this.size = size;
    }

    @Override
    public String toString() {
        return "Clothing{" + super.toString() +
                ", size='" + size + "'}";
    }
}
