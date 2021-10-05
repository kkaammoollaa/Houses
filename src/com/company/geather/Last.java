package com.company.geather;

import com.company.address.Address;
import com.company.address.Street;
import com.company.furniture.CheapOne;
import com.company.furniture.Furniture;
import com.company.rooms.Rooms;
import com.company.rooms.Small;

public class Last implements Geather{
    @Override
    public Address address() {
        return new Street();
    }

    @Override
    public Furniture furniture() {
        return new CheapOne();
    }

    @Override
    public Rooms rooms() {
        return new Small();
    }
}
