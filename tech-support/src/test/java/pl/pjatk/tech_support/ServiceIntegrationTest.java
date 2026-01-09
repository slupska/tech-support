package pl.pjatk.tech_support;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ServiceIntegrationTest {

    @Test
    void contextLoads() {

    }
    @Autowired
    Service service;

    @Autowired
    Storage storage;

    @BeforeEach
    void setUp() {

    }

    @Test
    void changeStatus_UpdateTicketInStorage() {
        // GIVEN
        storage.addTicket(new Ticket(1, "Ania", "Kasia", "new", "desc"));
        // WHEN
        service.changeStatus(1, "done");
        // THEN
        Ticket updated = storage.getTicketByID(1).orElseThrow();
        assertEquals("done", updated.getStatus());
    }

    @Test
    void changeAssignee_shouldUpdateTicketInStorage() {
        // GIVEN
        storage.addTicket(new Ticket(2, "Ania", "Kasia", "new", "desc"));
        // WHEN
        service.changeAssignee(2, "Julia");
        // THEN
        Ticket updated = storage.getTicketByID(2).orElseThrow();
        assertEquals("Julia", updated.getAssignee());
    }




}
