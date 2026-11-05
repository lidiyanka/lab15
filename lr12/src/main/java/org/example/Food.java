package org.example;

class Food extends Product {
    private String expirationDate;

    public Food(String name, int id, double price, String expirationDate) {
        super(name, id, price);
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "Food{" + super.toString() +
                ", expirationDate='" + expirationDate + "'}";
    }
}

