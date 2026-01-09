package pl.pjatk.tech_support;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

    @Test//czy wywalić?
    void ticketToStringTest() {
        // GIVEN
        Ticket ticket = new Ticket(123, "Ania", "Kasia", "w trakcie", "Internet jest wolny");
        // WHEN
        String result = ticket.toString();
        // THEN
        assertEquals("ID: 123 Assignee: Ania Reporter: Kasia Status: w trakcie Task Description: Internet jest wolny", result);
    }


}