package com.sijan.app;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    static final int PETFOOD = 1;
    static final int PET = 2;
    static final int MAMMAL = 3;
    static final int FISH = 4;

    private PetStoreItem[] itemsList;
    private int numItems;

    public Cart(int capacity) {
        itemsList = new PetStoreItem[capacity];
    }

    public void addItem(PetStoreItem item) {
        if (numItems >= itemsList.length)
            throw new IllegalStateException();

        itemsList[numItems++] = item;
    }

    public double cartTotalCost() {
        if (size() == 0)
            return 0;

        double totalCost = 0;
        for (int i = 0; i < size(); i++) {
            if (itemsList[i] instanceof PetFood) {
                PetFood petFood = (PetFood) itemsList[i];
                totalCost += petFood.itemTotalCost();
            } else {
                totalCost += itemsList[i].getPrice();
            }
        }

        return totalCost;
    }

    public int countType(int itemType) {
        int result = 0;

        if (itemType == PETFOOD) {
            for (int i = 0; i < numItems; i++) {
                if (itemsList[i] instanceof PetFood) {
                    result++;
                }
            }
        }

        if (itemType == PET) {
            for (int i = 0; i < numItems; i++) {
                if (itemsList[i] instanceof Pet) {
                    result++;
                }
            }
        }

        if (itemType == MAMMAL) {
            for (int i = 0; i < numItems; i++) {
                if (itemsList[i] instanceof Mammal) {
                    result++;
                }
            }
        }

        if (itemType == FISH) {
            for (int i = 0; i < numItems; i++) {
                if (itemsList[i] instanceof Fish) {
                    result++;
                }
            }
        }

        return result;
    }

    public int size() {
        return numItems;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();

        List<Mammal> mammalList = new ArrayList<>();
        List<Fish> fishList = new ArrayList<>();
        List<PetFood> foodList = new ArrayList<>();

        for (int i = 0; i < size(); i++) {
            if (itemsList[i] instanceof Mammal) {
                Mammal mammal = (Mammal) itemsList[i];
                mammalList.add(mammal);
            }

            if (itemsList[i] instanceof Fish) {
                Fish fish = (Fish) itemsList[i];
                fishList.add(fish);
            }

            if (itemsList[i] instanceof PetFood) {
                PetFood petFood = (PetFood) itemsList[i];
                foodList.add(petFood);
            }
        }

        if (!mammalList.isEmpty()) {
            buffer.append("MAMMALS");
            buffer.append(System.lineSeparator());
            buffer.append("Description \t Price \t Lovable \t Age \t Name \t Type \t Legs");
            buffer.append(System.lineSeparator());

            for (Mammal mammal : mammalList) {
                buffer.append(mammal.getDescription() + "\t");
                buffer.append(mammal.getPrice() + "\t");
                buffer.append(mammal.isLovable() + "\t");
                buffer.append(mammal.getAge() + "\t");
                buffer.append(mammal.getName() + "\t");
                buffer.append(mammal.getTypeOfMammal() + "\t");
                buffer.append(mammal.getNumLegs());
                buffer.append(System.lineSeparator());
            }
        }

        if (!fishList.isEmpty()) {
            buffer.append(System.lineSeparator());
            buffer.append("FISH");
            buffer.append(System.lineSeparator());
            buffer.append("Description \t Price \t Lovable \t Age \t Color \t Tropical");
            buffer.append(System.lineSeparator());

            for (Fish fish : fishList) {
                buffer.append(fish.getDescription() + "\t");
                buffer.append(fish.getPrice() + "\t");
                buffer.append(fish.isLovable() + "\t");
                buffer.append(fish.getAge() + "\t");
                buffer.append(fish.getColor() + "\t");
                buffer.append(fish.isTropical());
                buffer.append(System.lineSeparator());
            }
        }

        if (!foodList.isEmpty()) {
            buffer.append(System.lineSeparator());
            buffer.append("PET FOOD");
            buffer.append(System.lineSeparator());
            buffer.append("Description \t Unit Price \t Quantity \t Total Price");
            buffer.append(System.lineSeparator());

            for (PetFood petFood : foodList) {
                buffer.append(petFood.getDescription() + "\t");
                buffer.append(petFood.getPrice() + "\t");
                buffer.append(petFood.getQuantity() + "\t");
                buffer.append(petFood.itemTotalCost());
                buffer.append(System.lineSeparator());
            }
        }

        buffer.append(System.lineSeparator());
        buffer.append("Total Cost: " + cartTotalCost());
        return buffer.toString();
    }
}
