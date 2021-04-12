package dominio;

public class OperNotas {
	public float calcularpromedio(Alumno a) {
		float promedio = 0;
		promedio = (a.getNota1() + a.getNota2() + a.getNota3()) / 3;
		return promedio;
	}
}
