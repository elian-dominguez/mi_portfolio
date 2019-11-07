package tp4;

public class Temperatura {

	private double celsius;
	private double farenheit;
	private double kelvin;
	private double valor;
	private double temperatura;
	private static char opc;
	
	public Temperatura() {
	}

	public double convertir(char opc){
		double resultado=0;
		switch(opc){
		case 'c':
			resultado = temperatura;
			break;
		case 'f':
			resultado=(temperatura*1.8)+32;
			break;
		case 'k':
			resultado=temperatura+273.15;
			break;
		}
		return resultado;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}



	

//	public void setValor(double valor) {
//		this.celsius = valor;
//	}
//	public void setValor(double valor, String unidad){
//		this.celsius = valor;
//	}	
}
