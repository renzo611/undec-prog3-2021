package dominio.streams.ej01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ejemplo02 {
	public static void main(String[] args) {
		Persona p1 = new Persona("Luis", "Paez");
		Persona p2 = new Persona("Luisa", "Paez");
		Persona p3 = new Persona("Jorge", "Paez");
		
		List<Persona> aux = new ArrayList<Persona>();
		aux.add(p1);
		aux.add(p2);
		aux.add(p3);
		
//		aux.stream().forEach(System.out::println);
//		aux.stream().forEach(a -> System.out.println(a));
//		
//		aux
//			.stream()
//			.filter(p -> p.getNombre().contains("i"))
//			.forEach(System.out::println);
		
//		aux
//			.stream()
//			.map(p -> p.getApellido()+", "+p.getNombre())
//			.forEach(System.out::println);
		
//		
//		aux
//			.stream()
//			.peek(p -> p.setNombre("Alberto"))
//			.peek(p -> p.setApellido("Sanchez"))
//			.forEach(System.out::println);
//		
//		ArrayList<Persona> aux2=aux
//									.stream()
//									.filter(p -> p.getNombre().startsWith("L"))
//									.collect(Collectors.toCollection(ArrayList<Persona>::new));
//		System.out.println(aux2);
	}
}
