package pl.pjatk.tech_support;

import org.springframework.stereotype.Component;

@Component
public class Service {
    private Storage ticketStorage;

    public Service(Storage ticketStorage) {
        this.ticketStorage = ticketStorage;
    }

    public void changeStatus(int id, String status) {
        if (ticketStorage.getTicketByID(id).isEmpty()){//czy zmienić żeby nie było tyle razy getTicket...
            System.out.println("Ticket with id " + id + " not found");
        }
        else {
            ticketStorage.getTicketByID(id).get().setStatus(status);
            System.out.println("Ticket with id " + id + " has been changed to " + status);
        }
    }

    public void changeAssignee(int id, String assignee) {
        if(ticketStorage.getTicketByID(id).isEmpty()) {
            System.out.println("Ticket with id " + id + " not found");
        }
        else {
            ticketStorage.getTicketByID(id).get().setAssignee(assignee);
            System.out.println("Ticket with id " + id + " has been assigned to " + assignee);
        }
    }
}
