package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class TestAerolinea {
	Aerolinea a1 = new Aerolinea("Abu dhabi",15347812,"España","1245a");
	Piloto p1 = new Piloto("Damir","Yusopov",23412078,"23-23412078-7",EspecialidadPiloto.Piloto, "23435a","España");
	Piloto p2 = new Piloto("Renzo", "Fajardo",41730802,"23-41730802-7",EspecialidadPiloto.Copiloto,"23435b","Argentina");
	Piloto p3 = new Piloto("Antonio","Perez",23412078,"23-23412078-7",EspecialidadPiloto.Piloto, "23435c","España");
	@Test
	void agregar_nuevoPiloto() {
		assertTrue(a1.add_piloto(p1));
		assertTrue(a1.add_piloto(p2));
		assertFalse(a1.add_piloto(p3));
	}

	@Test
	void buscarPilotoPorCuil() {
		assertTrue(a1.add_piloto(p1));
		assertTrue(a1.add_piloto(p2));
		assertFalse(a1.add_piloto(p3));
		assertEquals("Damir Yusopov",a1.consultarPiloto_cuil("23-23412078-7"));
		assertEquals("Renzo Fajardo",a1.consultarPiloto_cuil("23-41730802-7"));
	}
	@Test
	void consultarExistenciaPiloto() {
		assertTrue(a1.add_piloto(p1));
		assertTrue(a1.add_piloto(p2));
		assertFalse(a1.add_piloto(p3));
		assertTrue(a1.consultarExistenciaPilto("23-41730802-7"));
		assertFalse(a1.consultarExistenciaPilto("23-41730802-9"));
	}
	@Test
	void AgregarAvion() {
		Avion a1 = new Avion("134a4", "Boeing 737-800","22-07-14",100);
		
		Avion a2 = new Avion("134a4", "Nuevo Avion","22-07-14",100);
		
		assertTrue(a1.agregarAvion(a1));
		assertTrue(a2.agregarAvion(a2));
		
	}
}
