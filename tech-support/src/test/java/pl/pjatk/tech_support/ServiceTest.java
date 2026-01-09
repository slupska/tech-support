package pl.pjatk.tech_support;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ServiceTest {

    @Mock
    private Storage storage;

    @InjectMocks
    private Service service;

    @Test
    void changeStatusTest(){
        //GIVEN
        Ticket ticket = new Ticket(1, "a", "b", "new", "desc");
        when(storage.getTicketByID(1)).thenReturn(Optional.of(ticket));
        //WHEN
        service.changeStatus(1,"done");
        //THEN
        assertEquals("done", ticket.getStatus());
    }

    @Test
    void changeStatusTicketNotFoundTest(){
        //GIVEN
        when(storage.getTicketByID(1)).thenReturn(Optional.empty());
        //WHEN
        service.changeStatus(1,"done");
        //THEN
        verify(storage, times(1)).getTicketByID(1);

    }

    @Test
    void changeAssigneeTest(){
        //GIVEN
        Ticket ticket = new Ticket(1, "a", "b", "new", "desc");
        when(storage.getTicketByID(1)).thenReturn(Optional.of(ticket));
        //WHEN
        service.changeAssignee(1,"c");
        //THEN
        assertEquals("c", ticket.getAssignee());
        verifyNoMoreInteractions(storage);


    }

}