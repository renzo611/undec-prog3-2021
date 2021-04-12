package dominio;

public class Alumno {
	private ImprimirDatosAlumno a;
	private OperNotas OpNotas;
	private String nombre;
	private String apellido;
	private int nota1;
	private int nota2;
	private int nota3;
	public Alumno(String nombre, String apellido, int nota1, int nota2, int nota3) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		a = new ImprimirDatosAlumno();
		OpNotas = new OperNotas();
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
	
	public int getNota1() {
		return nota1;
	}
	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}
	public int getNota2() {
		return nota2;
	}
	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}
	public int getNota3() {
		return nota3;
	}
	public void setNota3(int nota3) {
		this.nota3 = nota3;
	}

	

	public void ImprimirAlumno() {
		this.a.ImprimirAlumno(this);
	}
	
	public void calcularPromedio() {
		this.OpNotas.calcularpromedio(this);
	}
}
