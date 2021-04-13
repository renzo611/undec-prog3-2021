package dominio;


public interface BaseDeDatos {
	public void connect();
	public void dissconect();
	public void saveDate();
	public void deleteDate();
}

//De esta forma ninguna instacia debera depender de su implementacion
//solamente sabe que es una base de datos sin saber como funcionan sus metodos.
//Ninguna clase dependa de ninguna otra
