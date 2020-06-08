package ec.edu.ups.modelo;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Vehiculo implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String placa;
	private String marca;
	private String modelo;
	
	@ManyToOne
	@JoinColumn
	private Cliente cliente;
	
	@OneToOne(mappedBy = "vehiculo", cascade = CascadeType.ALL, orphanRemoval = true)
	private Ticket ticket;
	
	
	public Vehiculo() {
		
	}
	
	

	public Vehiculo(String placa, String marca, String modelo, Cliente cliente) {

		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.cliente = cliente;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getPlaca() {
		return placa;
	}



	public void setPlaca(String placa) {
		this.placa = placa;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	public Ticket getTicket() {
		return ticket;
	}



	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + ((placa == null) ? 0 : placa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		if (id != other.id)
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (placa == null) {
			if (other.placa != null)
				return false;
		} else if (!placa.equals(other.placa))
			return false;
		return true;
	}
	
	
	
}
