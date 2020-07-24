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
}
