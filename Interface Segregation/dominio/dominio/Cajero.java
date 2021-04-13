package dominio;

public class Cajero implements Empleado, ICajero{
	private String nombre;
	private String cedula;
	@Override
	public void generarFactura() {
		System.out.println("Generarando factura");
	}

	@Override
	public void cobrar() {
		System.out.println("Cobrar total de factura");
	}

	@Override
	public String getCedula() {
		return cedula;
	}

	@Override
	public String getNombre() {
		return cedula;
	}

}
