package ec.edu.ups.jpa;

import java.util.List;

import ec.edu.ups.modelo.Ticket;

public interface TicketDAO extends GenericDAO<Ticket, Integer>{
	public abstract List<Ticket> findTickets(String parametro);
	
}
