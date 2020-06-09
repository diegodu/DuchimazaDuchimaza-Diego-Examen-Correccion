package ec.edu.ups.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.ClienteDAO;
import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.VehiculoDAO;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Ticket;
import ec.edu.ups.modelo.Vehiculo;

/**
 * Servlet implementation class RegistroTicket
 */
@WebServlet("/agregar-ticket")
public class RegistroTicket extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroTicket() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String cedula = request.getParameter("cedula");
		String placa = request.getParameter("placa");
		String marca = request.getParameter("marca");
		String modelo = request.getParameter("modelo");
		String numero = request.getParameter("numero");
		String fechaEntrada = request.getParameter("fechaEntrada");
		String horaEntrda = request.getParameter("horaEntrda");
		String fechaSalida = request.getParameter("fechaSalida");
		String horaSalida = request.getParameter("horaSalida");
		
		ClienteDAO cliDao = DAOFactory.getDAOFactory().getClienteDAO();
		Cliente cliente = cliDao.findById(cedula);
		if (cliente == null) {
			
		}else {
			Vehiculo vehiculo = new Vehiculo(placa, marca, modelo, cliente);
			Ticket ticket = new Ticket(Integer.valueOf(numero), fechaEntrada, fechaSalida, horaEntrda, horaSalida, vehiculo);
			vehiculo.setTicket(ticket);
			cliente.addVehiculo(vehiculo);
			VehiculoDAO vehiculoDao = DAOFactory.getDAOFactory().getVehiculoDAO();
			vehiculoDao.create(vehiculo);
			cliDao.update(cliente);
		
			response.sendRedirect("lista");
		}
		
		

		
	}

}
