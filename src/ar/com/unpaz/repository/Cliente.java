package ar.com.unpaz.repository;

import java.util.Date;

public class Cliente {
	//Clase pojo
	private int id;
	private String nombreYApellido;
	private String tipoDefactura;
	private Date fecha;
	
	public Cliente(int id, String nombreYApellido, String tipoDefactura, Date fecha) {
		super();
		this.id = id;
		this.nombreYApellido = nombreYApellido;
		this.tipoDefactura = tipoDefactura;
		this.fecha = fecha;
	}
	public int getId() {
		return id;
	}
	public String getNombreYApellido() {
		return nombreYApellido;
	}
	public String getTipoDefactura() {
		return tipoDefactura;
	}
	public Date getFecha() {
		return fecha;
	}
}
