package com.oocl.cultivation;

import java.util.ArrayList;

public class SmartParkingBoy extends ParkingBoy{
    public SmartParkingBoy(ParkingLot parkingLot) {
        super(parkingLot);
    }

    @Override
    public Ticket parking(Car car) {
        if (car == null)
            return null;
        ParkingLot parkingLot = findParkingLotWithMostContains();
        if( parkingLot != null){
            return parkingLot.parking(car);
        }
        System.out.print("Not enough position.\n");
        return null;
    }

    @Override
    public ArrayList<ParkingLot> getParkingLotList() {
        return super.getParkingLotList();
    }

    public ParkingLot findParkingLotWithMostContains(){

        int indexOfParingLotWithMostContains = -1;
        ArrayList<ParkingLot> parkingLotList = getParkingLotList();
        int remainPositons = 0;
        int maxRemainPoositions = 0;
        int capacity = 0;
        ParkingLot parkingLot = null;
        if(parkingLotList.size()!=0){
             parkingLot = parkingLotList.get(0);
             capacity = parkingLot.getCapacity();
             remainPositons = capacity - parkingLot.getCarList().size();
             maxRemainPoositions = remainPositons;
             indexOfParingLotWithMostContains = 0;
        }
        for( int index = 1; index < parkingLotList.size(); index++){
            parkingLot = parkingLotList.get(index);
            capacity = parkingLot.getCapacity();
            remainPositons = capacity - parkingLot.getCarList().size();
            if( maxRemainPoositions < remainPositons){
                maxRemainPoositions = remainPositons;
                indexOfParingLotWithMostContains = index;
            }
        }
        if(indexOfParingLotWithMostContains!=-1){
            return parkingLotList.get(indexOfParingLotWithMostContains);
        }
        return null;
    }
}
