package dominio;

public class App {
	public static void main(String[] args) {
		Matematica m1 = new Matematica();
		
		System.out.println("El promedio de matematica del alumno es de: " + m1.promedio(10, 5, 2));
		
		Programacion m2 = new Programacion();
		
		System.out.println("El promedio de programacion del alumno en porcentaje es de: % " + m2.promedio(10, 10, 10));
	}
}
