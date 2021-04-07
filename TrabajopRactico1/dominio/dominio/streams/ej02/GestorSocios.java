package dominio.streams.ej02;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class GestorSocios {
	private static GestorSocios gs;
	private ArrayList<Socio> misSocios; 
	private GestorSocios() {
		misSocios= new ArrayList<Socio>();
	}
	
	public static GestorSocios getInstancia() {
		if (gs==null) gs=new GestorSocios();
		return gs;
	}
	
	public boolean addSocio(String nombre, String apellido, Calendar fechaNacto, Genero miGenero, int nroSocio, boolean tienePrestamos) {
		Socio aux = new Socio(nombre, apellido, fechaNacto, miGenero, nroSocio,tienePrestamos);
		if (!hayDuplicados(nroSocio)) return misSocios.add(aux);
		return false;
	}
	
	private boolean hayDuplicados(int nroSocio) {
		if (misSocios.size()>0) 
			for (Socio socio : misSocios) 
				if (socio.getNroSocio()==nroSocio)
					return true;
		return false;
	}
	
	public ArrayList<Socio> getSocios(Predicate<Socio> p, Comparator<Socio> c){
		return misSocios.stream().filter(p).sorted(c).collect(Collectors.toCollection(ArrayList<Socio>::new));
		
	}
	
	public ArrayList<String> getSocios2(Predicate<Socio> p, Comparator<Socio> c){
		return misSocios.stream().filter(p).sorted(c).map(s -> s.toString()).collect(Collectors.toCollection(ArrayList<String>::new));
		
	}
	
	public ArrayList<Integer> getSocios3(Predicate<Socio> p, Comparator<Socio> c){
		return misSocios.stream().filter(p).sorted(c).map(s -> s.getNroSocio()).collect(Collectors.toCollection(ArrayList<Integer>::new));
	}
	
}
