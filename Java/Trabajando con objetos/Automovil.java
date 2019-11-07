package ar.edu.unlam.pb1.tp1;

public class Automovil {
	private double velocidad;
	private double horas;
	private double distancia=0;
	
	public Automovil(double velocidad, double horas) {
		this.velocidad = velocidad;
		this.horas = horas;
	}
	
//	public void Pasaje() {
//		distancia = (velocidad / horas) * 3.6;
//	}
	
	public void Distancias() {
		distancia = velocidad * horas;
	}
}
