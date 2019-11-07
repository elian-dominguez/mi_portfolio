package tp4;

public class MainHermano {

	public static void main(String[] args) {
		Hermano miPersona = new Hermano("Elian", 22);
		Hermano miPersona2 = new Hermano("Sergio", 29);
		Hermano miPersona3 = new Hermano("Omar", 55);

		if (miPersona.getEdad() > miPersona2.getEdad()) {
			if (miPersona.getEdad() > miPersona3.getEdad()) {
				if (miPersona2.getEdad() > miPersona3.getEdad()) {
					System.out.println("El mayor es: " + miPersona.getNombre());
					System.out.println("El del medio es: " + miPersona2.getNombre());
					System.out.println("El menor es: " + miPersona3.getNombre());
				} else {
					System.out.println("El mayor es: " + miPersona.getNombre());
					System.out.println("El del medio es: " + miPersona3.getNombre());
					System.out.println("El menor es: " + miPersona2.getNombre());
				}
			} else {
				System.out.println("El mayor es: " + miPersona3.getNombre());
				System.out.println("El del medio es: " + miPersona.getNombre());
				System.out.println("El menor es: " + miPersona2.getNombre());
			}
		}
		if (miPersona2.getEdad() > miPersona3.getEdad()) {
			if (miPersona3.getEdad() > miPersona.getEdad()) {
				System.out.println("El mayor es: " + miPersona2.getNombre());
				System.out.println("El del medio es: " + miPersona3.getNombre());
				System.out.println("El menor es: " + miPersona.getNombre());
			} else {
				System.out.println("El mayor es: " + miPersona2.getNombre());
				System.out.println("El del medio es: " + miPersona.getNombre());
				System.out.println("El menor es: " + miPersona3.getNombre());
			}
		} else {
			System.out.println("El mayor es: " + miPersona3.getNombre());
			System.out.println("El del medio es: " + miPersona2.getNombre());
			System.out.println("El menor es: " + miPersona.getNombre());
		}
	}

}
