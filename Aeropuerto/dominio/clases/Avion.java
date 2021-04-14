package clases;

public class Avion {
	private String matricula;
	private String modelo;
	private String anioIngreso;
	private int capacidad;
	public Avion(String matricula, String modelo, String anioIngreso,int capacidad) {
		super();
		this.matricula = matricula;
		this.modelo = modelo;
		this.anioIngreso = anioIngreso;
		this.capacidad = capacidad;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public String getMatricula() {
		return matricula;
	}
	public String getAnioIngreso() {
		return anioIngreso;
	}
	
	
	
	
}
