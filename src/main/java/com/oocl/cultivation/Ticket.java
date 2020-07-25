package com.oocl.cultivation;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        if (ticket.carId.equals(this.carId)&&ticket.ticketId.equals(this.ticketId)) {
            return true;
        }
        return false;
    }


}
