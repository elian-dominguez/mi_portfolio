package Buenas;

public class MainCoche {

	public static void main(String[] args) {
		
		Coche miCoche = new Coche("Peugeot", "408", 200, 2018, 400.000);
		
		miCoche.setKilometros(250);
		miCoche.setPrecio(450.000);
		miCoche.setCantidadCoches(5);
		
		System.out.println(miCoche.getKilometros());
		System.out.println(miCoche.getPrecio());
		System.out.println(miCoche.getCantidadCoches());
		System.out.println(miCoche.calcularAntiguedad());
		System.out.println(miCoche.toString());

	}

}
