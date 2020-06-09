package ec.edu.ups.jpa;

import java.util.List;

import ec.edu.ups.dao.TicketDAO;
import ec.edu.ups.modelo.Ticket;

public class JPATicketDAO extends JPAGenericDao<Ticket, Integer> implements TicketDAO{

	public JPATicketDAO() {
		super(Ticket.class);
	}

	@Override
	public List<Ticket> findTickets(String parametro) {
				String sql = "FROM Cliente c, Vehiculo v, Ticket t WHERE v.id = t.vehiculo_id AND c.cedula = v.cliente_cedula AND c.cedula = '"+parametro+"' OR v.placa = '"+parametro+"'";
				List<Ticket> tickets = (List<Ticket>) em.createQuery(sql).getResultList();
				return tickets;
	}

}
