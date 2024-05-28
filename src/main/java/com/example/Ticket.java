package com.example;

public class Ticket {
    private double km;
    private int clientAge;

    public static final double PRICE_FOR_KM = 0.21;

    public Ticket(double km, int clientAge) {
        if (clientAge <= 0 || clientAge > 130) {
            throw new IllegalArgumentException("Age have to be between 0 and 130!");
        }
        if (km < 0) {
            throw new IllegalArgumentException("Km have to be greater than 0!");
        }
        this.km = km;
        this.clientAge = clientAge;
    }

    public double getTicketPrice() {
        double ticketPrice = km * PRICE_FOR_KM;

        if (clientAge < 18) {
            double discount = ticketPrice * (20.0 / 100.0);
            ticketPrice -= discount;
        } else if(clientAge > 65) {
            double discount = ticketPrice * (40.0 / 100.0);
            ticketPrice -= discount;
        }
        return ticketPrice;
    }

}
