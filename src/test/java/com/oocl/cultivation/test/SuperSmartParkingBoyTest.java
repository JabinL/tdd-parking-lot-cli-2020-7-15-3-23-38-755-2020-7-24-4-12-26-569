package com.oocl.cultivation.test;

import com.oocl.cultivation.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SuperSmartParkingBoyTest {
    @Test
    public void should_choose_P3_parkingLot_when_supersmartparkingboy_parking_given_3_parkinglots_P3_has_highest_positionrate() {
        //given
        Car car = new Car("C4");

        ParkingLot parkingLot_1 = new ParkingLot();
        List<Ticket> ticketList_1 = new ArrayList<>();
        List<Car> carList_1 = new ArrayList<>();
        ticketList_1.add(new Ticket("T1","C1","P1"));
        ticketList_1.add(new Ticket("T1","C2","P1"));
        carList_1.add(new Car("C1"));
        carList_1.add(new Car("C2"));
        parkingLot_1.setTicketList(ticketList_1);
        parkingLot_1.setCarList(carList_1);


        ParkingLot parkingLot_2 = new ParkingLot();
        List<Ticket> ticketList_2 = new ArrayList<>();
        List<Car> carList_2 = new ArrayList<>();
        for( int index =1; index <= 20; index++){
            ticketList_2.add(new Ticket("T"+index,"C"+index,"P2"));
            carList_2.add(new Car("C"+index));
        }
        parkingLot_2.setTicketList(ticketList_2);
        parkingLot_2.setCarList(carList_2);
        parkingLot_2.setCapacity(50);


        ParkingLot parkingLot_3 = new ParkingLot();
        List<Ticket> ticketList_3 = new ArrayList<>();
        List<Car> carList_3 = new ArrayList<>();
        ticketList_3.add(new Ticket("T1","C1","P3"));
        ticketList_3.add(new Ticket("T2","C2","P3"));
        ticketList_3.add(new Ticket("T3","C3","P3"));
        carList_3.add(new Car("C1"));
        carList_3.add(new Car("C2"));
        carList_3.add(new Car("C3"));
        parkingLot_3.setTicketList(ticketList_3);
        parkingLot_3.setCarList(carList_3);
        parkingLot_3.setCapacity(20);

        ParkingBoy parkingBoy = new SuperSmartParkingBoy(parkingLot_1);
        parkingBoy.addParkingLot(parkingLot_2);
        parkingBoy.addParkingLot(parkingLot_3);
        //when
        Ticket ticket = parkingBoy.parking(car);
        //then
        boolean isTicketOfP3 = false;
        if (ticket.getParkingLotId().equals("P3")) {
            isTicketOfP3 = true;
        }

        assertEquals(true, isTicketOfP3);
    }
}
