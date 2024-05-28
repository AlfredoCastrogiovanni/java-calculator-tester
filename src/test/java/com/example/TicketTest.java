package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TicketTest {
    @Test
    void testTicket() {
        assertThrows(IllegalArgumentException.class, () -> new Ticket(100, 131));
        assertThrows(IllegalArgumentException.class, () -> new Ticket(-5, 19));
    }

    @Test
    void testGetTicketPrice() {
        Ticket ticket = new Ticket(100, 19);
        assertEquals(21, ticket.getTicketPrice());
        Ticket ticket2 = new Ticket(100, 17);
        assertEquals(16.8, ticket2.getTicketPrice());
        Ticket ticket3 = new Ticket(100, 66);
        assertEquals(12.6, ticket3.getTicketPrice());
    }
}
