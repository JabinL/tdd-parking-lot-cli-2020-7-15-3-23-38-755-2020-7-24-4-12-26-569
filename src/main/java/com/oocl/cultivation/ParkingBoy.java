package com.oocl.cultivation;

public class ParkingBoy {

    private ParkingLot parkingLot;

    public ParkingBoy() {
    }

    public ParkingBoy(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public Ticket parking(Car car) {

        return new Ticket();
    }

    public Car fetching(Ticket ticket) {

        return new Car();
    }
}
