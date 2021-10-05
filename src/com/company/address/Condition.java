package com.company.address;

public class Condition implements  Address{
    @Override
    public void name() {
        System.out.println("Marat building");
    }

    @Override
    public void address() {
        System.out.println("block Uchtepa");
    }
}
