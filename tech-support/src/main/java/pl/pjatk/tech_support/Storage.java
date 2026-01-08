package pl.pjatk.tech_support;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class Storage {
    private List<Ticket> tickets;

    public Storage() {
        this.tickets = new ArrayList<>();
    }

    public List<Ticket> getTickets() {
        return tickets;//czy robić kopię listy?
    }

    public void addTicket(Ticket ticket) {
        if (ticket != null) {
            this.tickets.add(ticket);
        }
    }

    public void removeTicket(int id) {
        for (Ticket ticket : tickets) {
            if (ticket.getId() == id) {
                this.tickets.remove(ticket);
            }
        }
    }

    public Optional<Ticket> getTicketByID(int id) {
        for (Ticket ticket : tickets) {
            if (ticket.getId()==id) {
                return Optional.of(ticket);
            }
        }
        return Optional.empty();
    }

}
