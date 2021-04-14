package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class TestAeropuerto {
	Aeropuerto a1 = new Aeropuerto("A","Canada","Aeropuerto Nacional","27812453");
	Aeropuerto a2 = new Aeropuerto("DA","Argelia","Aeropuerto de Argelia","41812453");
	Aeropuerto a3 = new Aeropuerto("EB","Belgica","Belgica Aeropuerto","51812423");
	Aeropuerto a4 = new Aeropuerto("A","Canada","Aeropuerto Nacional","27812453");
	GestorAeropuerto ga = GestorAeropuerto.getInstancia();
	Aerolinea ae1 = new Aerolinea("Abu dhabi",15347812,"Dubai","1245a");
	Aerolinea ae2 = new Aerolinea("Qatar Airways",1245234,"Catar","134b");
	Aerolinea ae3 = new Aerolinea("Emirates",12345,"Emirates Arabes","1248");
	@Test
	void agregar_Aeropuerto() {
		assertTrue(ga.addAeropuerto(a1));
		assertTrue(ga.addAeropuerto(a2));
		assertTrue(ga.addAeropuerto(a3));
		assertFalse(ga.addAeropuerto(a4));
	}
	@Test
	void consultarExistenciia() {
		assertTrue(ga.consultarExistencia("27812453"));
		assertFalse(ga.consultarExistencia("27812421"));
	}
	@Test
	void consultarDatos() {
		assertEquals("Aeropuerto Nacional - Canada - A", ga.consultarDatos("27812453"));
		assertEquals("El aeropuerto no se encuentra registrado", ga.consultarDatos("77812453"));
	}
	
	@Test
	void agregarAerolinea() {
		assertTrue(a1.agregarAerolinea(ae1));
		assertTrue(a1.agregarAerolinea(ae2));
		assertFalse(a1.agregarAerolinea(ae1));
		assertTrue(a2.agregarAerolinea(ae1));
	}
	@Test
	void consultarCantAerolineas() {
		assertTrue(a1.agregarAerolinea(ae1));
		assertTrue(a1.agregarAerolinea(ae2));
		assertFalse(a1.agregarAerolinea(ae1));
		assertTrue(a2.agregarAerolinea(ae1));
		assertEquals(2,a1.cantAerolineas());
		assertEquals(0,a3.cantAerolineas());
		assertEquals(1,a2.cantAerolineas());
	}
}
