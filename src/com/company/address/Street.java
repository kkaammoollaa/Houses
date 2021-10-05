package com.company.address;

public class Street implements Address{
    @Override
    public void name() {
        System.out.println("Toskent city buildings");
    }

    @Override
    public void address() {
        System.out.println("Yunusobod");

    }
}
