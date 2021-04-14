package clases;

public class Piloto {
	private String nombre;
	private String apellido;
	private long dni;
	private String cuil;
	private EspecialidadPiloto especialidad;
	private String numLicencia;
	private String origen;
	
	public Piloto(String nombre, String apellido, long dni, String cuil, EspecialidadPiloto especialidad,
			String numLicencia,String origen) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.cuil = cuil;
		this.especialidad = especialidad;
		this.numLicencia = numLicencia;
		this.origen = origen;
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

	public EspecialidadPiloto getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(EspecialidadPiloto especialidad) {
		this.especialidad = especialidad;
	}
	public String getCuil() {
		return cuil;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cuil == null) ? 0 : cuil.hashCode());
		return result;
	}


	
}
