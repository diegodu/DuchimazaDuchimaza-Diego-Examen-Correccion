package ec.edu.ups.dao;

import java.util.List;

import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Vehiculo;

public interface VehiculoDAO extends GenericDAO<Vehiculo, Integer>{
	
	public abstract List<Vehiculo> findBycedulaOrPlaca(String cedula, String placa);

}
