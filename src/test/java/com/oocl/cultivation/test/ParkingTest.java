package com.oocl.cultivation.test;

import com.oocl.cultivation.Car;
import com.oocl.cultivation.ParkingBoy;
import com.oocl.cultivation.Ticket;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParkingTest {

    @Test
    public void should_return_1_ticket_when_parkingboy_parking_given_1_car(){
        //given
        Car car  = new Car();
        ParkingBoy parkingBoy = new ParkingBoy();

        //when
        Ticket ticket  = parkingBoy.parking(car);

        //then
        boolean isNUll = true;
        if(ticket == null){
            isNUll = false ;
        }
        assertEquals(true,isNUll);
    }

    @Test
    public void should_return_car_when_parkingboy_fetching_given_1_ticket(){
        //given
        Ticket ticket = new Ticket();
        ParkingBoy parkingBoy = new ParkingBoy();

        //when
        Car car  = parkingBoy.fetching(ticket);

        //then
        boolean isNotNUll = true;
        if(car == null){
            isNotNUll = false ;
        }
        assertEquals(true,isNotNUll);
    }
}
