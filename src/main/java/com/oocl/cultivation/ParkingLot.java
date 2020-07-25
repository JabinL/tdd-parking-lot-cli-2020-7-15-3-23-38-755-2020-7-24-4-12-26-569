package com.oocl.cultivation;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private List<Car> carList = new ArrayList<>();
    private List<Ticket> ticketList = new ArrayList<>();
    private List<Ticket> haveUsedTicketList = new ArrayList<>();
    public ParkingLot() {
    }

    public Ticket parking(Car car){
        carList.add(car);
        Ticket ticket =  new Ticket(this.ticketList.size()+1+"",car.getCarId());
        this.ticketList.add(ticket);
        return ticket;
    }

    public Car fetching(Ticket ticket){

        if(ticket == null){
            System.out.print("Your ticket is wrong, you can't fetch car!\n");
            return null;
        }
        if(isTicketHaveUsed(ticket)){
            System.out.print("Your ticket has been used, you can't fetch car!\n");
            return null;
        }
        if(findTicket(ticket) == null){
            System.out.print("Your ticket is wrong, you can't fetch car!\n");
            return null;
        }
        String carId = ticket.getCarId();
        return findCar(carId);
    }

    public boolean isTicketHaveUsed(Ticket ticket){
        for( int index = 0; index < this.haveUsedTicketList.size(); index++){
            if(this.haveUsedTicketList.get(index).equals(ticket)){
                return true;
            }
        }
        return false;
    }
    public Ticket findTicket(Ticket ticket){

        if(ticket == null){
            return null;
        }
        for( int index = 0; index < this.ticketList.size(); index++){
            if(this.ticketList.get(index).equals(ticket)){
                this.ticketList.remove(index);
                this.haveUsedTicketList.add(ticket);
                return ticket;
            }
        }
        return null;
    }

    public Car findCar(String carId){
        if( carId == null){
            return null;
        }
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

    public List<Ticket> getTicketList() {
        return ticketList;
    }

    public void setTicketList(List<Ticket> ticketList) {
        this.ticketList = ticketList;
    }

    public List<Ticket> getHaveUsedTicketList() {
        return haveUsedTicketList;
    }

    public void setHaveUsedTicketList(List<Ticket> haveUsedTicketList) {
        this.haveUsedTicketList = haveUsedTicketList;
    }
}
