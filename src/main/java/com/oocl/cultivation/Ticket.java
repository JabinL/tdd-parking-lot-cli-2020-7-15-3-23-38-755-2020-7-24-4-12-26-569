package com.oocl.cultivation;

import java.util.Objects;

public class Ticket {

    private String ticketId;
    private String carId;
    private String parkingLotId;

    public Ticket() {
    }

    public Ticket(String ticketId, String carId, String parkingLotId) {
        this.ticketId = ticketId;
        this.carId = carId;
        this.parkingLotId = parkingLotId;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(String parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        if (ticket.carId.equals(this.carId) && ticket.ticketId.equals(this.ticketId) && ticket.parkingLotId.equals(parkingLotId)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId='" + ticketId + '\'' +
                ", carId='" + carId + '\'' +
                ", parkingLotId='" + parkingLotId + '\'' +
                '}';
    }
}
