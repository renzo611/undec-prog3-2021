package dominio;

public class ImprimirDatosAlumno {
	public void ImprimirAlumno(Alumno a) {
		System.out.println("Nombre: "+a.getNombre());
		System.out.println("Apellido: "+a.getApellido());
	}
}
