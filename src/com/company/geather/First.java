package com.company.geather;

import com.company.address.Address;
import com.company.address.Condition;
import com.company.furniture.Cupboard;
import com.company.furniture.Furniture;
import com.company.rooms.Huge;
import com.company.rooms.Normal;
import com.company.rooms.Rooms;

public class First implements Geather{

    @Override
    public Address address() {
        return new Condition();
    }

    @Override
    public Furniture furniture() {
        return new Cupboard();
    }

    @Override
    public Rooms rooms() {
        return new Huge();
    }
}
