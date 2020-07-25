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
        this.carList = getCarList();
        String carId = ticket.getCarId();
        for( int index = 0; index < this.carList.size(); index++){
            if(this.carList.get(index).getCarId().equals(carId)){
                this.carList.remove(index);
                return new Car(carId);
            }
        }
        return null;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }
}
