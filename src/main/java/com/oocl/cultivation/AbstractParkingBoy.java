package com.oocl.cultivation;

import java.util.ArrayList;

public abstract class AbstractParkingBoy {
    protected ArrayList<ParkingLot> parkingLotList = new ArrayList<>();

    public abstract Ticket parking(Car car);
    public abstract Car fetching(Ticket ticket);
}
