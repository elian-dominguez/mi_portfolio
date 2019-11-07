package TP3;

public class MainCerradura {

	public static void main(String[] args) {

		int cantidadDeIntentos = 0;
		int cantidadDeIntentosMax = 2;

		Cerradura miCerradura = new Cerradura(1234, 2);
		Cerradura miCerradura2 = new Cerradura(1234,2);
		miCerradura.abrir(1234);
		boolean bloqueo = miCerradura.fueBloqueada();
		System.out.println("Mi cerradura esta: "+bloqueo);
		
		miCerradura2.abrir(1232);
		boolean bloqueo2 = miCerradura2.fueBloqueada();
		
		System.out.println("Mi cerradura esta: "+bloqueo2);
		miCerradura2.abrir(123312);
		miCerradura2.abrir(1231324);
		System.out.println("Mi cerradura esta: "+bloqueo2);
	}
}
