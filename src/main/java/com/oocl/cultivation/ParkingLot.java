package com.oocl.cultivation;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private List<Car> carList = new ArrayList<>();
    private List<Ticket> ticketList = new ArrayList<>();
    private List<Ticket> haveUsedTicketList = new ArrayList<>();
    private int capacity = 10;
    private String parkingLotId;

    public ParkingLot() {
    }

    public Ticket parking(Car car) {
        if (isFull()) {
            System.out.print("Not enough position.\n");
            return null;
        }
        carList.add(car);
        Ticket ticket = new Ticket("T" + this.ticketList.size() + 1 + "", car.getCarId(), this.parkingLotId);
        this.ticketList.add(ticket);
        return ticket;
    }

    public Car fetching(Ticket ticket) {


        if (isTicketHaveUsed(ticket)) {
            System.out.print("Unrecognized parking ticket.\n");
            return null;
        }
        if (findTicket(ticket) == null) {
            System.out.print("Unrecognized parking ticket.\n");
            return null;
        }
        String carId = ticket.getCarId();
        return findCar(carId);
    }

    public boolean isTicketHaveUsed(Ticket ticket) {
        for (int index = 0; index < this.haveUsedTicketList.size(); index++) {
            if (this.haveUsedTicketList.get(index).equals(ticket)) {
                return true;
            }
        }
        return false;
    }

    public Ticket findTicket(Ticket ticket) {

        if (ticket == null) {
            return null;
        }
        for (int index = 0; index < this.ticketList.size(); index++) {
            if (this.ticketList.get(index).equals(ticket)) {
                this.ticketList.remove(index);
                this.haveUsedTicketList.add(ticket);
                return ticket;
            }
        }
        return null;
    }

    public boolean isFull() {
        if (this.ticketList.size() < this.capacity) {
            return false;
        }
        return true;
    }

    public Car findCar(String carId) {
        if (carId == null) {
            return null;
        }
        for (int index = 0; index < this.carList.size(); index++) {
            if (this.carList.get(index).getCarId().equals(carId)) {
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

    public String getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(String parkingLotId) {
        this.parkingLotId = parkingLotId;
    }
}
