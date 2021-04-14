package clases;

import java.util.ArrayList;

public class GestorVuelos {
	private GestorVuelos ga;
	private ArrayList<Vuelo> misVuelos;
	
	
	private GestorVuelos() {
		misVuelos = new ArrayList<Vuelo>();
	}
	public GestorVuelos getInstancia() {
		if(ga == null) ga = new GestorVuelos();
		return ga;
	}
	
	private boolean estaCargado(Vuelo v1) {
		for (Vuelo v : misVuelos) {
			if(v.getidVuelo().equals(v1.getidVuelo()))
				return false;
		}
		return true;
	}
	public boolean add_vuelo(Vuelo v1) {
		if(!estaCargado(v1))
			return misVuelos.add(v1);
		return false;
	}
	
}
