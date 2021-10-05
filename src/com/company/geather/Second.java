package com.company.geather;

import com.company.address.Address;
import com.company.address.City;
import com.company.furniture.Furniture;
import com.company.furniture.KitchenFurniture;
import com.company.rooms.Normal;
import com.company.rooms.Rooms;

public class Second implements Geather{
    @Override
    public Address address() {
        return new City();
    }

    @Override
    public Furniture furniture() {
        return new KitchenFurniture();
    }

    @Override
    public Rooms rooms() {
        return new Normal();
    }
}
