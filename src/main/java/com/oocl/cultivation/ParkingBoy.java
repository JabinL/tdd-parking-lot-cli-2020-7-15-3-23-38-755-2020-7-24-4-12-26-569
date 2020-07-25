package com.oocl.cultivation;

public class ParkingBoy {

    private ParkingLot parkingLot;

    public ParkingBoy(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public Ticket parking(Car car) {
        return this.parkingLot.parking(car);
    }

    public Car fetching(Ticket ticket) {
        return this.parkingLot.fetching(ticket);
    }
}
