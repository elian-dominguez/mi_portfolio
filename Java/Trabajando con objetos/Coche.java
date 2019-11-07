package Buenas;

public class Coche {
	
	 int CERO_KM;
	 int ANO_ACTUAL=2019;
	 static int cantidadCoches;
	 String marca;
	 String modelo;
	 int kilometros;
	 int ano;
	 double precio;
	 int antiguedad=0;
	 
	 public Coche(String marca, String modelo, double precio){
		 this.marca=marca;
		 this.modelo=modelo;
		 this.precio=precio;
	 }
	 public Coche(String marca, String modelo, int kilometros, int ano, double precio){
		 this.marca=marca;
		 this.modelo=modelo;
		 this.kilometros=kilometros;
		 this.ano=ano;
		 this.precio=precio;
	 }
	public static int getCantidadCoches() {
		return cantidadCoches;
	}
	public static void setCantidadCoches(int cantidadCoches) {
		Coche.cantidadCoches = cantidadCoches;
	}
	public int getKilometros() {
		return kilometros;
	}
	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int calcularAntiguedad(){
		this.antiguedad= this.ANO_ACTUAL - ano;
		return this.antiguedad;
	}
	public String toString (){
        String mensaje="La cantidad de coches es "+cantidadCoches+"corre "+kilometros+"tiene un precio de "+precio+"y una antiguedad de "+ANO_ACTUAL;
               
        return mensaje;
    }

}
