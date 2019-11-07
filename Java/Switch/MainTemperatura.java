package tp4;

public class MainTemperatura {
	public static void main(String[] args) {

	//No necesito generar un objeto para llamar un metodo estatico
	Temperatura miT = new Temperatura();
	
	miT.setValor(25.4);
	
	System.out.println("Mi temperatura en celsius es: "+miT.getValor());
	System.out.println("Mi temperatura en farenheit es: "+miT.convertir('f'));
	System.out.println("Mi temperatura en kelvin es: "+miT.convertir('k'));
	
	}
}
