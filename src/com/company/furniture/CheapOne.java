package com.company.furniture;

public class CheapOne implements Furniture{
    @Override
    public void quality() {
        System.out.println(" it is not bad");
    }

    @Override
    public void type() {
        System.out.println("it is given fee for you");

    }
}
