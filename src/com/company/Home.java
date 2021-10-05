package com.company;

import com.company.address.Address;
import com.company.furniture.Furniture;
import com.company.geather.Geather;
import com.company.rooms.Rooms;

public class Home {
    private Address address;
    private Furniture furniture;
    private Rooms rooms;


public Home(Geather geather) {
    this.address    = geather.address();
    this.furniture  = geather.furniture();
    this.rooms      = geather.rooms();

}
public void Display(){

     address.name();
     address.address();


     furniture.type();
     furniture.quality();

     rooms.name();
     rooms.inaddition();
}





}
