package dominio.streams.ej01;

import java.util.function.Consumer;
import java.util.function.Function;

public class Ejemplo00 {
	public static void main(String[] args) {
		Consumer<Persona> c = p -> System.out.println(p);
		
		Consumer<Persona> c2 = System.out::println;
		
		
		Function<Integer,Integer> f = (i) -> { return Math.abs(i);};
		
		Function<Integer,Integer> f3 = i -> Math.abs(i);  
		
		Function<Integer,Integer> f2 = Math::abs;
	}
}
