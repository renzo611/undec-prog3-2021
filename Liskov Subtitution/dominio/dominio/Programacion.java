package dominio;

public class Programacion implements PromedioCalc{

	@Override
	public double promedio(double n1, double n2, double n3) {
		return ((n1+n2+n3)/3)*10;
	}

}
