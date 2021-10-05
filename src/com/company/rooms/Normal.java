package com.company.rooms;

public class Normal implements Rooms{
    @Override
    public void name() {
        System.out.println("kitchen");
    }

    @Override
    public void inaddition() {
        System.out.println("inaddition furniture");
    }
}
