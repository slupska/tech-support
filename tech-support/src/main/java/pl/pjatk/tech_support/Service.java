package pl.pjatk.tech_support;

import org.springframework.stereotype.Component;

@Component
public class Service {
    private Storage storage;

    public Service(Storage ticketStorage) {
        this.storage = ticketStorage;
    }

    public void changeStatus(int id, String status) {
        if (storage.getTicketByID(id).isEmpty()){
            System.out.println("Ticket with id " + id + " not found");
        }
        else {
            storage.getTicketByID(id).get().setStatus(status);
            System.out.println("Ticket with id " + id + " has been changed to " + status);
        }
    }

    public void changeAssignee(int id, String assignee) {
        if(storage.getTicketByID(id).isEmpty()) {
            System.out.println("Ticket with id " + id + " not found");
        }
        else {
            storage.getTicketByID(id).get().setAssignee(assignee);
            System.out.println("Ticket with id " + id + " has been assigned to " + assignee);
        }
    }
}
