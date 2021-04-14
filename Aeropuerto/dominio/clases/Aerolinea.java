package clases;

import java.util.ArrayList;

public class Aerolinea {
	private String nombre;
	private int telefono;
	private String origen;
	private String id;
	private ArrayList<Piloto> pilotos;
	private ArrayList<Avion> misAviones;
	public Aerolinea(String nombre, int telefono, String origen, String id) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.origen = origen;
		this.id = id;
		pilotos = new ArrayList<Piloto>();
		misAviones = new ArrayList<Avion>();
	}
	
	
	public String getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	private boolean estaCargado(Piloto p1) {
		for (Piloto piloto : pilotos) {
			if(p1.getCuil().equals(piloto.getCuil()))
				return true;
		}
		return false;
	}
	public boolean add_piloto(Piloto p1) {
		if(!estaCargado(p1))
			return pilotos.add(p1);
		return  false;
	}

	public String consultarPiloto_cuil(String cuil) {
		for (Piloto piloto : pilotos) {
			if(piloto.getCuil().equals(cuil)) {
				return piloto.getNombre()+" "+piloto.getApellido();
			}
		}
		return "El piloto no se encuentra registrado";
	}

	public Boolean consultarExistenciaPilto(String cuil) {
		for (Piloto piloto : pilotos) {
			if(piloto.getCuil().equals(cuil)) return true;
		}
		return false;
	}
	
	private boolean estaCargado(Avion a1) {
		for (Avion a : misAviones) {
			if(a1.getMatricula().equals(a.getMatricula()))
				return true;
		}
		return false;
	}
	public boolean agregarAvion(Avion a1) {
		if(!estaCargado(a1))
			return misAviones.add(a1);
		return false;
	}
}
