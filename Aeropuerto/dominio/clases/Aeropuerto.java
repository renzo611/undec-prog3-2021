package clases;

import java.util.ArrayList;
import java.util.function.BooleanSupplier;

public class Aeropuerto {
	private String codigoIcao;	
	private String ubicacion;
	private String nombre;
	private String cuil;
	private ArrayList<Aerolinea> misAerolineas;
	public Aeropuerto(String codigoIcao, String ubicacion, String nombre, String cuil) {
		super();
		this.codigoIcao = codigoIcao;
		this.ubicacion = ubicacion;
		this.nombre = nombre;
		this.cuil = cuil;
		misAerolineas = new ArrayList<Aerolinea>();
	}
	public String getCodigoIcao() {
		return codigoIcao;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public String getNombre() {
		return nombre;
	}
	public String getCuil() {
		return cuil;
	}
	private boolean estaCargado(String id) {
		for (Aerolinea ae : misAerolineas) {
			if(id.equals(ae.getId()))
				return true;
		}
		return false;
	}
	public Boolean agregarAerolinea(Aerolinea ae1) {
		if(!estaCargado(ae1.getId()))
			return misAerolineas.add(ae1);
		return false;
	}
	public int cantAerolineas() {
		return misAerolineas.size();
	}
	
	
	
}
