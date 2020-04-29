package com.sijan.app;

import java.text.DecimalFormat;

public class PetFood extends PetStoreItem {
    private int quantity;

    public PetFood(String description, double price, int quantity) {
        super(description, price);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double itemTotalCost() {
        return getPrice() * getQuantity();
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer(super.toString());
        result.append("\t");
        result.append(quantity);
        result.append("\t");
        result.append(new DecimalFormat("#.##").format(getPrice() * getQuantity()) + "$");
        return result.toString();
    }
}
