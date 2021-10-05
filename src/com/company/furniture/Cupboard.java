package com.company.furniture;

public class Cupboard implements Furniture{
    @Override
    public void quality() {
        System.out.println("it up to your cost of house");
    }

    @Override
    public void type() {
        System.out.println("which is made by hand");

    }
}
