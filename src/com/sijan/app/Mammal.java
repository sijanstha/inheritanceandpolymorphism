package com.sijan.app;

public class Mammal extends Pet {
    static final int DOG = 0;
    static final int CAT = 1;

    private String name;
    private int typeOfMammal;
    private int numLegs;

    public Mammal(String description, double price, boolean lovable, int age, String name, int typeOfMammal, int numLegs) {
        super(description, price, lovable, age);
        this.name = name;
        this.typeOfMammal = typeOfMammal;
        this.numLegs = numLegs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTypeOfMammal() {
        return typeOfMammal;
    }

    public void setTypeOfMammal(int typeOfMammal) {
        this.typeOfMammal = typeOfMammal;
    }

    public int getNumLegs() {
        return numLegs;
    }

    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }

    public String speak() {
        switch (typeOfMammal) {
            case DOG:
                return "Bow wow";

            case CAT:
                return "Meow";

            default:
                return null;
        }
    }


    @Override
    public String toString() {
        StringBuffer result = new StringBuffer(super.toString());
        result.append("\t");
        result.append(name);
        result.append("\t");
        result.append(getMammalType());
        result.append("\t");
        result.append(numLegs);
        return result.toString();
    }

    private String getMammalType() {
        switch (typeOfMammal) {
            case DOG:
                return "DOG";

            case CAT:
                return "CAT";

            default:
                return "OTHER";
        }
    }
}
