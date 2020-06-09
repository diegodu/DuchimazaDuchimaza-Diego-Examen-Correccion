package ec.edu.ups.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.ClienteDAO;
import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.VehiculoDAO;
import ec.edu.ups.modelo.Cliente;
import ec.ups.edu.dao.PersonaDAO;
import ec.ups.edu.modelo.Persona;

/**
 * Servlet implementation class Lista
 */
@WebServlet("/lista")
public class Lista extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Lista() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String cedula = request.getParameter("cedula");
		 String placa = request.getParameter("placa");
		ClienteDAO clienteDao = DAOFactory.getDAOFactory().getClienteDAO();
		List<Cliente> clientes = clienteDao.find();
		 
        VehiculoDAO vehiculoDao = DAOFactory.getDAOFactory().getVehiculoDAO()
        List<Vehiculo> vehiculos = vehiculoDao.findBycedulaOrPlaca(cedula, placa);
		
		
		request.setAttribute("vehiculos", vehiculos);
		System.out.println("hola");
		getServletContext().getRequestDispatcher("/jsp/ListaTickets.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
