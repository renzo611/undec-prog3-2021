package dominio.streams.ej02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.function.Predicate;

public class TestManual {

	public static void main(String[] args) {
		GestorSocios gs = GestorSocios.getInstancia();
		gs.addSocio("Luis", "Paez", new GregorianCalendar(1990, 10,2), Genero.M, 123, true);
		gs.addSocio("Alberto", "Rodriguez", new GregorianCalendar(1991, 10,2), Genero.M, 124, false);
		gs.addSocio("Marcelo", "Gonzalez", new GregorianCalendar(1992, 10,2), Genero.M, 125, true);
		gs.addSocio("Carlos", "Albarez", new GregorianCalendar(1980, 10,2), Genero.M, 128, false);
		gs.addSocio("Lucas", "Belgrano", new GregorianCalendar(2000, 10,2), Genero.M, 130, true);
		gs.addSocio("Luisa", "Romero", new GregorianCalendar(1990, 10,2), Genero.F, 111, false);
		gs.addSocio("Ana", "Muñoz", new GregorianCalendar(1991, 10,2), Genero.F, 119, true);
		gs.addSocio("Romina", "Suarez", new GregorianCalendar(1992, 10,2), Genero.F, 126, false);
		gs.addSocio("Carla", "Ruiz", new GregorianCalendar(1980, 10,2), Genero.F, 129, true);
		gs.addSocio("Laura", "Redondo", new GregorianCalendar(2000, 10,2), Genero.F, 100, false);
		
		ArrayList<Socio> aux = gs.getSocios(s -> s.getNombre().contains("L"), new Comparator<Socio>() {
			public int compare(Socio o1, Socio o2) {
				return o1.getApellido().compareTo(o2.getApellido());
			}
		});
//		imprimir(aux);
//		aux = gs.getSocios(s -> s.getMiGenero().equals(Genero.F), new Comparator<Socio>() {
//			public int compare(Socio o1, Socio o2) {
//				return o1.getFechaNacto().compareTo(o2.getFechaNacto());
//			}
//		});
//		imprimir(aux);
//		
//		aux = gs.getSocios(s -> s.getNroSocio()>110, new Comparator<Socio>() {
//			public int compare(Socio o1, Socio o2) {
//				return o1.getNroSocio()-o2.getNroSocio();
//			}
//		});
//		imprimir(aux);
//		
//		
//		Predicate<Socio> p1 = s -> s.getTienePrestamos()==false;
//		Predicate<Socio> p2 = s -> s.getMiGenero().equals(Genero.F);
//		Predicate<Socio> p3 = s -> s.getEdad()>21;
//		Predicate<Socio> p = p1.and(p2).and(p3);
////		
//		aux = gs.getSocios(p, new Comparator<Socio>() {
//			public int compare(Socio o1, Socio o2) {
//				return o1.getApellido().compareTo(o2.getApellido());
//			}
//		});
//		imprimir(aux);
//		
		Predicate<Socio> p4 = s -> s.getTienePrestamos()==false && s.getMiGenero().equals(Genero.F) && s.getEdad()>21;
//		aux = gs.getSocios(p4, new Comparator<Socio>() {
//			public int compare(Socio o1, Socio o2) {
//				return o1.getApellido().compareTo(o2.getApellido());
//			}
//		});
//		imprimir(aux);
//		
//		
		ArrayList<String> aux2 = gs.getSocios2(p4, new Comparator<Socio>() {
			public int compare(Socio o1, Socio o2) {
				return o1.getApellido().compareTo(o2.getApellido());
			}
		});
		imprimir2(aux2);
		
	}
	
	private static void imprimir(ArrayList<Socio> aux) {
		aux.stream().forEach(System.out::println);
		System.out.println("*****************************");
	}
	
	private static void imprimir2(ArrayList<String> aux) {
		aux.stream().forEach(System.out::println);
		System.out.println("*****************************");
	}
	
//	private static void imprimir(ArrayList<Object> aux) {
//		aux.stream().forEach(System.out::println);
//		System.out.println("*****************************");
//	}
	
}
