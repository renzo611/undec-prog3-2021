package dominio.streams.ej02;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Socio {
	private String nombre;
	private String apellido;
	private Calendar fechaNacto;
	private Genero miGenero;
	private int nroSocio;
	private boolean tienePrestamos;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Socio(String nombre, String apellido, Calendar fechaNacto, Genero miGenero, int nroSocio,
			boolean tienePrestamos) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacto = fechaNacto;
		this.miGenero = miGenero;
		this.nroSocio = nroSocio;
		this.tienePrestamos = tienePrestamos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Calendar getFechaNacto() {
		return fechaNacto;
	}

	public void setFechaNacto(Calendar fechaNacto) {
		this.fechaNacto = fechaNacto;
	}

	public Genero getMiGenero() {
		return miGenero;
	}

	public void setMiGenero(Genero miGenero) {
		this.miGenero = miGenero;
	}

	public int getNroSocio() {
		return nroSocio;
	}

	public void setNroSocio(int nroSocio) {
		this.nroSocio = nroSocio;
	}

	public boolean getTienePrestamos() {
		return tienePrestamos;
	}

	public void setTienePrestamos(boolean tienePrestamos) {
		this.tienePrestamos = tienePrestamos;
	}
	
	public int getEdad() {
		Calendar hoy =  GregorianCalendar.getInstance();
		return hoy.get(Calendar.YEAR)-fechaNacto.get(Calendar.YEAR);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + nroSocio;
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
		Socio other = (Socio) obj;
		if (nroSocio != other.nroSocio)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return nroSocio+" ("+ miGenero + ") " + apellido + "," + nombre + "(" + sdf.format(fechaNacto.getTime())
				+  ") - Prestamos=" + tienePrestamos;
	}
	
	
	
	
	
}
