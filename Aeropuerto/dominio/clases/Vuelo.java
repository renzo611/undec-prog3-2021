package clases;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Vuelo {
	private ArrayList<Piloto> pilotos;
	private Avion avion;
	private Aerolinea aerolinea;
	private Aeropuerto llegada;
	private Aeropuerto salida;
	private GregorianCalendar hora_salida;
	private GregorianCalendar hora_llegada;
	private String id_vuelo;
	
	public Vuelo(ArrayList<Piloto> pilotos, Avion avion, Aerolinea aerolinea, Aeropuerto salida, Aeropuerto llegada,
			GregorianCalendar hora_salida, GregorianCalendar hora_llegada,String id_vuelo) {
		super();
		this.pilotos = pilotos;
		this.avion = avion;
		this.aerolinea = aerolinea;
		this.llegada = llegada;
		this.salida = salida;
		this.hora_salida = hora_salida;
		this.hora_llegada = hora_llegada;
		this.id_vuelo = id_vuelo;
		configurarMes();
	}

	private void configurarMes() {
		hora_salida.add(Calendar.MONTH, -1);
		hora_llegada.add(Calendar.MONTH, -1);
	}
	public String getidVuelo() {
		return id_vuelo;
	}
	public String getHoraSalida() {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        return sdf.format(this.hora_salida.getTime());
	}
	public String getHoraLlegada() {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		return sdf.format(this.hora_llegada.getTime());
	}
	public String getFechaSalida() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		return sdf.format(this.hora_salida.getTime());
	}
	public String getFechaLlegada() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		return sdf.format(this.hora_llegada.getTime());
	}
	public String getAeropuertoSalida() {
		return salida.getNombre() + " - " + salida.getUbicacion();
	}
	public String getAeropuertoLlegada() {
		return llegada.getNombre() + " - " + llegada.getUbicacion();
	}
	public String getAerolinea() {
		return aerolinea.getNombre();
	}
	public String getPiloto() {
		for (Piloto piloto : pilotos) {
			if(piloto.getEspecialidad().equals(EspecialidadPiloto.Piloto))
				return piloto.getNombre() + " "  + piloto.getApellido();
		}
		return "No hay pilotos a bordos";
	}
	public String getCopiloto() {
		for (Piloto piloto : pilotos) {
			if(piloto.getEspecialidad().equals(EspecialidadPiloto.Copiloto))
				return piloto.getNombre() + " "  + piloto.getApellido();
		}
		return "No hay Copilotos a bordos";
	}
	public void setHorario(GregorianCalendar g,GregorianCalendar g1) {
		this.hora_salida = g;
		this.hora_llegada = g1;
		configurarMes();
	}
	
}
