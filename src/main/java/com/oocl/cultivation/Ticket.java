package com.oocl.cultivation;

public class Ticket {

    private String ticketId;
    private String carId;

    public Ticket() {
    }

    public Ticket(String ticketId, String carId) {
        this.ticketId = ticketId;
        this.carId = carId;
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
}
