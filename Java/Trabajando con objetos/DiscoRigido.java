package ar.edu.unlam.pb1.tp1;

public class DiscoRigido {

//	Crear la clase DiscoRigido que contenga un atributo tamaño y un método que informe
//	cuantos cuántos dvd (4.5GB) equivale dicha capacidad y otro método que informe a
//	cuántos blue ray (15GB) equivalen. Crear la clase PruebaDiscoRigido que verifique el
//	correcto funcionamiento para los siguientes ejemplos:
//	a. seagate de 10 TB
//	b. hitachi de 20 TB
//	c. westernDigital de 32 TB
//	d. toshiba de 48 TB 
	
	private double tamano;
	private double tamanodvd;
	private double cantidaddvd;
	private double cantidadblueray;
	private double dvd=4.5;
	private double blueray= 15.0;
	
	public DiscoRigido(double tamano) {
		this.tamano = tamano;
	}
	
	public void pasaje() {
		dvd= (dvd*1024)*this.tamano;
		blueray= (blueray*1024)*this.tamano;
		System.out.println("La cantidad de dvd es: " + dvd);
		System.out.println("La cantidad de blueray es: " + blueray);
	}
	
}
