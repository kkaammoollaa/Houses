package com.company.geather;

import com.company.address.Address;
import com.company.furniture.Furniture;
import com.company.rooms.Rooms;

public interface Geather {
    Address address();
    Furniture furniture();
    Rooms rooms();
}
