package com.company.address;

public class City implements Address{
    @Override
    public void name() {
        System.out.println("Hayot");
    }

    @Override
    public void address() {
        System.out.println("block Chilonzor");
    }
}
