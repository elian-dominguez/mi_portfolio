package tp4;

public class Distancia {

	private double km;
	private double cm;
	private double hm;
	private double m;
	private double valor;
	
	public Distancia(double valor){
		this.valor=valor;
	}
	public double convertir(int unidad){
		double resultado = 0;
		switch(unidad){
		case 1:
			System.out.println("Metros");
			resultado=this.m;
			break;
		case 2:
			System.out.println();
			resultado=this.m/0.01;
		}
	}
	
}
