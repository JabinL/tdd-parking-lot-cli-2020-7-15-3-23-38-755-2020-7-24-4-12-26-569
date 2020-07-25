package com.oocl.cultivation.test;

import com.oocl.cultivation.Car;
import com.oocl.cultivation.ParkingBoy;
import com.oocl.cultivation.ParkingLot;
import com.oocl.cultivation.Ticket;
import org.junit.jupiter.api.Test;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ParkingTest {

    private static ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeAll
    public static void setup() {
        System.setOut(new PrintStream(outContent));
    }
    private String systemOut() {
        return outContent.toString();
    }

    @Test
    public void should_return_1_ticket_when_parkingboy_parking_given_1_car(){
        //given
        Car car  = new Car("Car1");
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

//    @Test
//    public void should_return_car_when_parkingboy_fetching_given_1_ticket(){
//        //given
//        Ticket ticket = new Ticket();
//        ParkingLot parkingLot = new ParkingLot();
//        ParkingBoy parkingBoy = new ParkingBoy(parkingLot);
//
//        //when
//        Car car  = parkingBoy.fetching(ticket);
//
//        //then
//        boolean isNotNUll = true;
//        if(car == null){
//            isNotNUll = false ;
//        }
//        assertEquals(true,isNotNUll);
//    }

    @Test
    public void should_return_2_tickets_when_parkingboy_parking_given_2_cars(){
        //given
        Ticket ticket = new Ticket();
        Car car1 = new Car("Car1");
        Car car2 = new Car("Car2");
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

    @Test
    public void should_return_right_car_when_parkingboy_fetching_given_right_ticket(){
        //given
        Ticket ticket = new Ticket("T1","Car1");
        List<Car> carList = new ArrayList<>();
        List<Ticket> ticketList = new ArrayList<>();
        ticketList.add(ticket);
        carList.add(new Car("Car1"));
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setCarList(carList);
        parkingLot.setTicketList(ticketList);
        ParkingBoy parkingBoy = new ParkingBoy(parkingLot);

        //when
        Car car  = parkingBoy.fetching(ticket);

        //then
        boolean isRightCar = false;
        if(car.getCarId().equals("Car1")){
            isRightCar = true ;
        }

        assertEquals(true,isRightCar);
    }

    @Test
    public void should_print_tips_when_parkingboy_fetching_given_wrong_ticket(){
        //given
        Ticket ticket = new Ticket("wrong","Car1");
        List<Car> carList = new ArrayList<>();
        List<Ticket> ticketList = new ArrayList<>();
        ticketList.add(new Ticket("T1","Car1"));
        carList.add(new Car("Car1"));
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setCarList(carList);
        parkingLot.setTicketList(ticketList);
        ParkingBoy parkingBoy = new ParkingBoy(parkingLot);

        //when
        Car car  = parkingBoy.fetching(ticket);

        //then
        boolean isTipsRight = false;
        if(systemOut().endsWith("Your ticket is wrong, you can't fetch car!\n")){
            isTipsRight = true ;
        }

        assertEquals(true,isTipsRight);
    }

    @Test
    public void should_print_tips_when_parkingboy_fetching_given_have_used_ticket(){
        //given
        Ticket ticket = new Ticket("T1","Car1");
        List<Car> carList = new ArrayList<>();
        List<Ticket> ticketList = new ArrayList<>();
        List<Ticket> haveUsedTicketList = new ArrayList<>();
        ticketList.add(new Ticket("T2","Car2"));
        haveUsedTicketList.add(ticket);
        carList.add(new Car("Car1"));
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setCarList(carList);
        parkingLot.setTicketList(ticketList);
        parkingLot.setHaveUsedTicketList(haveUsedTicketList);
        ParkingBoy parkingBoy = new ParkingBoy(parkingLot);

        //when
        Car car  = parkingBoy.fetching(ticket);

        //then
        boolean isTipsRight = false;
        if(systemOut().endsWith("Your ticket has been used, you can't fetch car!\n")){
            isTipsRight = true ;
        }
        assertEquals(true,isTipsRight);
    }


}
