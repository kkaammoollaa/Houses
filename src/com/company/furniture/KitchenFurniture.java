package com.company.furniture;

public class KitchenFurniture implements Furniture{
    @Override
    public void quality() {
        System.out.println("your choice determines it");
    }

    @Override
    public void type() {
        System.out.println("it is made from wood");

    }
}
