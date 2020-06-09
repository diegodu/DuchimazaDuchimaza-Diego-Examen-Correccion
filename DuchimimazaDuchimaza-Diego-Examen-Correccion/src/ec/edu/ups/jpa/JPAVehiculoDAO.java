package ec.edu.ups.jpa;

import java.util.ArrayList;
import java.util.List;

import ec.edu.ups.dao.ClienteDAO;
import ec.edu.ups.dao.VehiculoDAO;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Vehiculo;

public class JPAVehiculoDAO extends JPAGenericDao<Vehiculo, Integer> implements VehiculoDAO{

	public JPAVehiculoDAO(){
		super(Vehiculo.class);

	}
	public List<Vehiculo> findBycedulaOrPlaca(String cedula, String placa) {
		// TODO Auto-generated method stub
		List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		if(cedula.equals("all") && placa.equals("all")) {
			vehiculos = (List<Vehiculo>) em.createQuery("FROM Vehiculo v").getResultList();
		}else {
			String spql = "FROM Vehiculo v WHERE v.placa = '"+placa+ "'AND v.cliente.cedula = '"+cedula+"'";
			vehiculos = (List<Vehiculo>) em.createQuery(spql).getResultList();
		}
		return vehiculos;
	}

}
