package org.example;

class Electronics extends Product {
    private int warranty;

    public Electronics(String name, int id, double price, int warranty) {
        super(name, id, price);
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return "Electronics{" + super.toString() +
                ", warranty=" + warranty + " мес.}";
    }
}

