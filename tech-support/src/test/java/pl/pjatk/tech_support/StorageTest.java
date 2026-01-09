package pl.pjatk.tech_support;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;


import static org.junit.jupiter.api.Assertions.*;

class StorageTest {
private Storage storage;

@BeforeEach
    void setUp() {
    this.storage = new Storage();
}

@Test
    void addTicketTest(){
    //GIVEN
    Ticket ticket = new Ticket(1, "a", "b", "new", "desc");
    //WHEN
    storage.addTicket(ticket);
    //THEN
    assertTrue(storage.getTicketByID(1).isPresent());
}

    @Test
    void addTicketNull() {
        storage.addTicket(null);

        assertTrue(storage.getTickets().isEmpty());
    }

    @Test
    void removeTicketTest(){
        //GIVEN
        Ticket ticket = new Ticket(1, "a", "b", "new", "desc");
        storage.addTicket(ticket);
        assertTrue(storage.getTicketByID(1).isPresent());
        //WHEN
        storage.removeTicket(1);
        //THEN
        assertTrue(storage.getTicketByID(1).isEmpty());
    }

}