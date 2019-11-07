package TP3;

public class MainPersona {

	public static void main(String[] args) {

		Persona miPersona = new Persona("Elian", "Masculino", 40490632, 20, 122, 2);

		miPersona.alimentar(150);
		miPersona.crecer(2);
		miPersona.cumplirAnios();
		double peso = miPersona.pesar();
		System.out.println("Mi persona pesa: " + peso);
		System.out.println(miPersona.toString());

		boolean mayor = miPersona.esMayorDeEdad();
		if (mayor == true) {
			System.out.println("Mi persona es mayor de edad");
		} else {
			System.out.println("Mi persona es menor de edad");
		}
		miPersona.morir();
		System.out.println("Mi persona se murio al ver como subio el dolar :(");
		System.out.println(miPersona.toString());

		double pesoIdeal = miPersona.calcularIMC();
		if(pesoIdeal == -1) {
			System.out.println("La persona esta en el peso ideal");
		}else 
			if(pesoIdeal == 0) {
				System.out.println("La persona esta por debajo de su peso ideal");
		}else {
			System.out.println("La persona tiene sobre peso, deberia dejar de comer hamburguesas");
		}

	}

}
