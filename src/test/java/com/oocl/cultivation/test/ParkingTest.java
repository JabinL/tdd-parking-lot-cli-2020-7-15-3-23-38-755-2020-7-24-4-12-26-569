package com.oocl.cultivation.test;

import com.oocl.cultivation.Car;
import com.oocl.cultivation.ParkingBoy;
import com.oocl.cultivation.ParkingLot;
import com.oocl.cultivation.Ticket;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParkingTest {

    @Test
    public void should_return_1_ticket_when_parkingboy_parking_given_1_car(){
        //given
        Car car  = new Car();
        ParkingLot parkingLot = new ParkingLot();
        ParkingBoy parkingBoy = new ParkingBoy(parkingLot);

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

    @Test
    public void should_return_2_tickets_when_parkingboy_parking_given_2_cars(){
        //given
        Ticket ticket = new Ticket();
        Car car1 = new Car();
        Car car2 = new Car();
        ParkingLot parkingLot = new ParkingLot();
        ParkingBoy parkingBoy = new ParkingBoy(parkingLot);

        //when
        Ticket ticket1  = parkingBoy.parking(car1);
        Ticket ticket2 = parkingBoy.parking(car2);

        //then
        int countTicket = 0;
        if(ticket1!=null){
            countTicket++;
        }
        if(ticket2 != null){
            countTicket++;
        }
        assertEquals(2,countTicket);
    }
}
