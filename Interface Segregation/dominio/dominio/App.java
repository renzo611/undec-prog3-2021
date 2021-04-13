package dominio;

public class App {
	public static void main(String[] args) {
		Cajero e1 = new Cajero();
		Repositor e2 = new Repositor();
		
		e1.getCedula();
		e1.getNombre();
		e2.getCedula();
		e2.getNombre();
		//Como sabemos tanto un cajero como un repositor son empleados, pero
		//no realizan las mismas tareas, es por eso que ambas clases implementan
		//los metodos de la interface Empleado que contiene metodos que ambos pueden aplicar.
		
		
		e1.generarFactura();
		e1.cobrar();
		
		//Un cajero puede generar una factura de una compra como tambien guardar los productos para 
		//que los clientes los lleven, es por eso que ademas de implementar los metodos de Empleado tambien
		//implementa los metodos de ICajero.
		
		e2.generarListaStock();
		e2.ordenarProductos();
		//Un repositor no puede realizar las tareas de un cajero, es por eso que no implementa los metodos
		// de ICajero, pero si implmenta los metodos de IRepositor para realizar diferentes tareas.
		//Lo mismo sucede con un cajero, este no puede implementar los metodos de IRepositor.
		
	}
}
