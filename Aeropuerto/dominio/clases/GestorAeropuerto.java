package clases;

import java.util.ArrayList;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public class GestorAeropuerto {
	private static GestorAeropuerto ga;
	private ArrayList<Aeropuerto> misAeropuertos;
	
	private GestorAeropuerto(){
		misAeropuertos = new ArrayList<Aeropuerto>();
	}
	
	public static GestorAeropuerto getInstancia() {
		if(ga == null) ga = new GestorAeropuerto();
		return ga;
	}
	public boolean estaCargado(String a1) {
		for (Aeropuerto aeropuerto : misAeropuertos) {
			if(a1.equals(aeropuerto.getCuil()))
				return true;
		}
		return false;
	}
	public Boolean addAeropuerto(Aeropuerto a1) {
		if(!estaCargado(a1.getCuil()))
			return misAeropuertos.add(a1);
		return false;
	}

	public Boolean consultarExistencia(String cuil) {
		return estaCargado(cuil);
	}

	public String consultarDatos(String string) {
		for (Aeropuerto aeropuerto : misAeropuertos) {
			if(string.equals(aeropuerto.getCuil()))
				return aeropuerto.getNombre() + " - " + aeropuerto.getUbicacion() + " - " + aeropuerto.getCodigoIcao();
		}
		return "El aeropuerto no se encuentra registrado";
	}
	
	
}
