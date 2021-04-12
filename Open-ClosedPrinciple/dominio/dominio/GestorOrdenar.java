package dominio;

public interface GestorOrdenar {
	public void ordenar();
}
//Este interface es la encargada de la aplicacion del principio open-closed
//Lo que permite es que cuando soliciten una nueva forma de ordenar
//No tengamos que modificar ningun metodo, solamente basta con crear una clase y aplicar
//el metodo ordenar