package com.sijan.app;

public class ShoppingDriver {
    public static void main(String[] args) {
        Mammal dog = new Mammal("German Shepherd",50.6,true, 3,"Kario",0,4);
        Mammal cat = new Mammal("Bull Dog",12,true, 4,"Smokey",1,4);
        System.out.println(dog.speak());
        System.out.println(cat.speak());

        Fish goldFish = new Fish("Gold Fish", 1, true, 3,"Gold", true);
        Fish crap = new Fish("Crap", 2.3, false, 3,"Silver", false);
        Fish guppy = new Fish("Guppy", 5, false, 7,"White", false);

        PetFood canned = new PetFood("Canned",20,1);
        PetFood treats = new PetFood("Treats",10,2);
        PetFood fishFeed = new PetFood("Fish Feed",3.5,10);

        Cart cart = new Cart(8);
        cart.addItem(dog);
        cart.addItem(cat);
        cart.addItem(goldFish);
        cart.addItem(crap);
        cart.addItem(guppy);
        cart.addItem(canned);
        cart.addItem(treats);
        cart.addItem(fishFeed);
        System.out.println(cart.countType(3));
        System.out.println(cart.cartTotalCost());
        System.out.println("CART ITEMS = " + cart.size());
        System.out.println();
        System.out.println(cart);
    }
}
