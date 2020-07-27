package com.oocl.cultivation;

import java.util.ArrayList;

public class ParkingBoy {

    protected ArrayList<ParkingLot> parkingLotList = new ArrayList<>();

    public ParkingBoy(ParkingLot parkingLot) {
        parkingLot.setParkingLotId("P" + (parkingLotList.size() + 1));
        this.parkingLotList.add(parkingLot);
    }

    public void addParkingLot(ParkingLot parkingLot) {
        parkingLot.setParkingLotId("P" +( parkingLotList.size() + 1));
        this.parkingLotList.add(parkingLot);
    }

    public Ticket parking(Car car) {
        for(ParkingLot parkingLot: parkingLotList){
            if(!parkingLot.isFull()){
                return parkingLot.parking(car);
            }
        }
        System.out.print("Not enough position.\n");
        return null;
    }

    public Car fetching(Ticket ticket) {
        if (ticket == null) {
            System.out.print("Please provide your parking ticket.\n");
            return null;
        }
        for (ParkingLot parkingLot : parkingLotList) {
            System.out.println("Ticket:" + ticket.getParkingLotId());
            System.out.println("ParkingLot:" + parkingLot.getParkingLotId());
            if (ticket.getParkingLotId().equals(parkingLot.getParkingLotId())) {
                return parkingLot.fetching(ticket);
            }
        }
        System.out.print("Unrecognized parking ticket.\n");
        return null;
    }

    public ArrayList<ParkingLot> getParkingLotList() {
        return parkingLotList;
    }

}
