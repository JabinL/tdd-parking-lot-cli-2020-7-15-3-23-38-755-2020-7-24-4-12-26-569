package com.oocl.cultivation;

import java.util.ArrayList;

public class SuperSmartParkingBoy extends SmartParkingBoy{
    public SuperSmartParkingBoy(ParkingLot parkingLot) {
        super(parkingLot);
    }

    @Override
    public Ticket parking(Car car) {
        if (car == null) {
            return null;
        }

        ParkingLot parkingLot = findParkingLotWithHighestPositionRate();
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

    public ParkingLot findParkingLotWithHighestPositionRate(){

        int indexOfParingLotWithHighestPositionRate = -1;
        ArrayList<ParkingLot> parkingLotList = getParkingLotList();
        double maxPositionRate = 0;
        double positionRate = 0;
        ParkingLot parkingLot = null;
        if(parkingLotList.size()!=0){
            parkingLot = parkingLotList.get(0);
            indexOfParingLotWithHighestPositionRate = 0;
            maxPositionRate = parkingLot.getPositonRate();
        }
        for( int index = 1; index < parkingLotList.size(); index++){
            parkingLot = parkingLotList.get(index);
            positionRate = parkingLot.getPositonRate();
            if( maxPositionRate < positionRate){
                maxPositionRate = positionRate;
                indexOfParingLotWithHighestPositionRate= index;
            }
        }
        if(indexOfParingLotWithHighestPositionRate!=-1){
            return parkingLotList.get(indexOfParingLotWithHighestPositionRate);
        }
        return null;
    }
}
