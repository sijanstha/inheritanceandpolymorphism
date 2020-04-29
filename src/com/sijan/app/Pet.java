package com.sijan.app;

public class Pet extends PetStoreItem {
    private boolean lovable;
    private int age;

    public Pet(String description, double price, boolean lovable, int age) {
        super(description, price);
        this.lovable = lovable;
        this.age = age;
    }

    public boolean isLovable() {
        return lovable;
    }

    public void setLovable(boolean lovable) {
        this.lovable = lovable;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer(super.toString());
        result.append("\t");
        result.append(this.lovable);
        result.append("\t");
        result.append(this.age);

        return result.toString();
    }
}
