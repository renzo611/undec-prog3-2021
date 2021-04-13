package dominio;

public class Repositor implements Empleado, IRepositor{
	private String nombre;
	private String cedula;
	@Override
	public void generarListaStock() {
		System.out.println("Generarndo lista de stock de productos faltantes");
	}

	@Override
	public void ordenarProductos() {
		System.out.println("Ordenando productos");
	}

	@Override
	public String getCedula() {
		return cedula;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

}
