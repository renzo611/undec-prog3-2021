package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Avion;


class TestAvion {
	@Test
	void consultarNombre() {
		Avion a1 = new Avion("134a4", "Boeing 737-800","22-07-14",100);
		assertEquals("Boeing 737-800",a1.getModelo());
		
		Avion a2 = new Avion("134a4", "Nuevo Avion","22-07-14",100);
		assertEquals("Nuevo Avion",a2.getModelo());
	}
	@Test
	void consultarCapacidad() {
		Avion a1 = new Avion("134a4", "Boeing 737-800","22-07-14",100);
		Avion a2 = new Avion("134a4", "Nuevo Avion","22-07-14",300);
		
		assertEquals(100,a1.getCapacidad());
		assertEquals(300,a2.getCapacidad());
	}
	
	@Test
	void setCapacidad() {
		Avion a1 = new Avion("134a4", "Boeing 737-800","22-07-14",100);
		Avion a2 = new Avion("134a4", "Nuevo Avion","22-07-14",300);
		
		a1.setCapacidad(250);
		a2.setCapacidad(350);
		
		assertEquals(250,a1.getCapacidad());
		assertEquals(350,a2.getCapacidad());
	}
}
