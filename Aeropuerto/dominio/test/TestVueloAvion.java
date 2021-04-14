package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class TestVueloAvion {
	Piloto p1 = new Piloto("Damir","Yusopov",23412078,"23-23412078-7",EspecialidadPiloto.Piloto, "23435a","España");
	Piloto p2 = new Piloto("Renzo", "Fajardo",41730802,"23-41730802-7",EspecialidadPiloto.Copiloto,"23435b","Argentina");
	ArrayList<Piloto> pilotos = new ArrayList<Piloto>();
	Avion a1 = new Avion("134a4", "Boeing 737-800","22-07-14",100);
	Aeropuerto salida = new Aeropuerto("Du","Dubai","Aeropuerto Nacional","22-11174-23");
	Aeropuerto llegada = new Aeropuerto("Es","España","Aeropuerto de Badajos","11-22174-12");
	GregorianCalendar horaSalida =  new GregorianCalendar(2020,04,13,22,00,00);
	GregorianCalendar horaLlegada =  new GregorianCalendar(2020,04,15,9,00,00);
	Aerolinea ae1 = new Aerolinea("Emirates Arabes",123467,"Dubai","15");
	
	@Test
	void getHoraSalida() {
		//Agregar Pilotos
		pilotos.add(p1);
		pilotos.add(p2);
		Vuelo vuelo = new Vuelo(pilotos,a1,ae1,salida,llegada,horaSalida,horaLlegada,"12ab");
		assertEquals("22:00",vuelo.getHoraSalida());
	}
	
	@Test
	void getHorallegada() {
		pilotos.add(p1);
		pilotos.add(p2);
		Vuelo vuelo = new Vuelo(pilotos,a1,ae1,salida,llegada,horaSalida,horaLlegada,"12ab");
		assertEquals("09:00",vuelo.getHoraLlegada());
	}
	@Test
	void getFechaSalida() {
		pilotos.add(p1);
		pilotos.add(p2);
		Vuelo vuelo = new Vuelo(pilotos,a1,ae1,salida,llegada,horaSalida,horaLlegada,"12ab");
		assertEquals("13-04-2020",vuelo.getFechaSalida());
	}
	@Test
	void getFechaLlegada() {
		pilotos.add(p1);
		pilotos.add(p2);
		Vuelo vuelo = new Vuelo(pilotos,a1,ae1,salida,llegada,horaSalida,horaLlegada,"12ab");
		assertEquals("15-04-2020",vuelo.getFechaLlegada());
	}
	@Test
	void getAeropuertoSalida() {
		pilotos.add(p1);
		pilotos.add(p2);
		Vuelo vuelo = new Vuelo(pilotos,a1,ae1,salida,llegada,horaSalida,horaLlegada,"12ab");
		
		assertEquals("Aeropuerto Nacional - Dubai",vuelo.getAeropuertoSalida());
	}
	@Test
	void getAeropuertollegada() {
		pilotos.add(p1);
		pilotos.add(p2);
		Vuelo vuelo = new Vuelo(pilotos,a1,ae1,salida,llegada,horaSalida,horaLlegada,"12ab");
		
		assertEquals("Aeropuerto de Badajos - España",vuelo.getAeropuertoLlegada());
	}

	@Test
	void consultarAerolinea() {
		pilotos.add(p1);
		pilotos.add(p2);
		Vuelo vuelo = new Vuelo(pilotos,a1,ae1,salida,llegada,horaSalida,horaLlegada,"12ab");
		
		assertEquals("Emirates Arabes", vuelo.getAerolinea());
	}
	@Test
	void getPiloto() {
		pilotos.add(p1);
		pilotos.add(p2);
		Vuelo vuelo = new Vuelo(pilotos,a1,ae1,salida,llegada,horaSalida,horaLlegada,"12ab");
		assertEquals("Damir Yusopov",vuelo.getPiloto());
	}
	@Test
	void getCopiloto() {
		pilotos.add(p1);
		pilotos.add(p2);
		Vuelo vuelo = new Vuelo(pilotos,a1,ae1,salida,llegada,horaSalida,horaLlegada,"12ab");
		assertEquals("Renzo Fajardo",vuelo.getCopiloto());
	}
	@Test
	void setHorario() {
		pilotos.add(p1);
		pilotos.add(p2);
		Vuelo vuelo = new Vuelo(pilotos,a1,ae1,salida,llegada,horaSalida,horaLlegada,"12ab");
		assertEquals("22:00",vuelo.getHoraSalida());
		assertEquals("09:00",vuelo.getHoraLlegada());
		assertEquals("13-04-2020",vuelo.getFechaSalida());
		assertEquals("15-04-2020",vuelo.getFechaLlegada());
		
		GregorianCalendar nuevaSalida = new GregorianCalendar(2020,04,13,02,00,00);
		GregorianCalendar nuevaLlegada = new GregorianCalendar(2020,04,15,13,00,00);
		vuelo.setHorario(nuevaSalida,nuevaLlegada);
		
		
		assertEquals("02:00",vuelo.getHoraSalida());
		assertEquals("13:00",vuelo.getHoraLlegada());
		assertEquals("13-04-2020",vuelo.getFechaSalida());
		assertEquals("15-04-2020",vuelo.getFechaLlegada());
	}
	
	
}
