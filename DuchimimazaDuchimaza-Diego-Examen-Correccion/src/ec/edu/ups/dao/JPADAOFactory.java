/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.jpa.JPAClienteDAO;
import ec.edu.ups.jpa.JPATicketDAO;
import ec.edu.ups.jpa.JPAVehiculoDAO;

/**
 *
 * @author claum
 */
public class JPADAOFactory extends DAOFactory{

	@Override
	public ClienteDAO getClienteDAO() {
		return new JPAClienteDAO();
	}

	@Override
	public VehiculoDAO getVehiculoDAO() {
		return new JPAVehiculoDAO();
	}

	@Override
	public TicketDAO getTicketDAO() {
		return new JPATicketDAO();
	}
    
}
