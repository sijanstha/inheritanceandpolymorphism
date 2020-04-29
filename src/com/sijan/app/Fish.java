package com.sijan.app;

public class Fish extends Pet{
    private String color;
    private boolean tropical;

    public Fish(String description, double price, boolean lovable, int age, String color, boolean tropical) {
        super(description, price, lovable, age);
        this.color = color;
        this.tropical = tropical;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isTropical() {
        return tropical;
    }

    public void setTropical(boolean tropical) {
        this.tropical = tropical;
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer(super.toString());
        result.append("\t");
        result.append(color);
        result.append("\t");
        result.append(tropical);
        return result.toString();
    }
}
