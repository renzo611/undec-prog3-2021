package dominio.streams.ej01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ejemplo01 {
	public static void main(String[] args) {
		
		Stream<Persona> streamVacio = Stream.empty();
		
		Persona p1 = new Persona("Luis", "Paez");
		Persona p2 = new Persona("Luisa", "Paez");
		Persona p3 = new Persona("Jorge", "Paez");
		
		List<Persona> aux = new ArrayList<Persona>();
		aux.add(p1);
		aux.add(p2);
		aux.add(p3);
		
		Stream<Persona> streamsDeUnArrayList = aux.stream();
		
		Persona [] array = new Persona[5];
		
		array[0]=p1;
		array[1]=p2;
		array[2]=p3;
		
		Stream<Persona> streamDeUnArrayCompleto = Arrays.stream(array);
		Stream<Persona> streamDeUnArrayParte = Arrays.stream(array, 1, 3);
		

		
	}
}
