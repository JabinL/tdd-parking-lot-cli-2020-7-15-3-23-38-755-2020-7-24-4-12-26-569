package com.oocl.cultivation;

public class Car {
    private String carId;

    public Car(String carId) {
        this.carId = carId;
    }

    public Car() {
    }
    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    @Override
    public boolean equals(Object obj) {
        if( obj == null){
            return false;
        }
        if (obj instanceof Car){
            if(((Car) obj).getCarId().equals(this.getCarId())){
                return true;
            }
        }
        return false;
    }
}
