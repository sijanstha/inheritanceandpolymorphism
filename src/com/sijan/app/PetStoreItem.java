package com.sijan.app;

import java.text.DecimalFormat;

public abstract class PetStoreItem {
    private String description;
    private double price;

    public PetStoreItem(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.description + "\t" + new DecimalFormat("#.##").format(price) + "$";
    }
}
