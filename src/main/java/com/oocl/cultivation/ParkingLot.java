package com.oocl.cultivation;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private List<Car> carList = new ArrayList<>();
    public ParkingLot() {
    }

    public Ticket parking(Car car){
        carList.add(car);
        return new Ticket();
    }

    public Car fetching(Ticket ticket){

        return null;
    }

}
