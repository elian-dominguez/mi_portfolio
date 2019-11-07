package TP3;

public class Punto {

	private double x;
	private double y;
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getx() {
		return x;
	}
	public double gety() {
		return y;
	}
	
	public void Eje() {
		if(this.x==0 && this.y !=0) {
			System.out.println("Las coordenadas son " + x +"," +  y);
			System.out.println("El punto esta sobre el eje Y");
			
		}
		if(this.y == 0 && this.x !=0) {
			System.out.println("Las coordenadas son " + x + "," +y);
			System.out.println("El punto esta sobre el eje X");
			
		}
		if(this.y==0 && this.x==0) {
			System.out.println("Las coordenadas son " + x +  "," +y);
			System.out.println("El punto esta sobre el origen de coordenadas");
			
		}
		if(this.x !=0 && this.y!=0) {
			System.out.println("Las coordenadas son " + x +  "," +y);
			System.out.println("No esta sobre ningun eje");
			
		}
	}
	public void setx(double x) {
		this.x = x;
	}
	
	public void sety(double y) {
		this.y = y;
	}
}
