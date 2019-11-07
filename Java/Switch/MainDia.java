package tp4;

public class MainDia {

	public static void main(String[] args) {
		Dia miDia = new Dia();
		Dia miDia2 = new Dia();
		Dia miDia3 = new Dia();

		String dia = miDia.semana(2);
		System.out.println("El dia es: " + dia);

		String dia2 = miDia2.semana(5);
		System.out.println("El dia es: " + dia2);
		
		String dia3 = miDia3.semana(1);
		System.out.println("El dia es: " + dia3);
	}
}
