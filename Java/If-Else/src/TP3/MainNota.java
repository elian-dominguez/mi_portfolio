package TP3;

public class MainNota {

	public static void main(String[] args) {

		Nota miNota = new Nota(3);
		boolean evalua = miNota.aprobado();
		if (evalua == true) {
			System.out.println("Aprobo la materia");
		} else {
			System.out.println("Esta desaprobado");
		}
		Nota miNota2 = new Nota(7);
		boolean evalua2 = miNota2.aprobado();
		if (evalua2 == true) {
			System.out.println("Aprobo la materia");
		} else {
			System.out.println("Esta desaprobado");
		}
		Nota miNota3 = new Nota(2);
		System.out.println("Mi nota es: " + miNota3.getValor());
		miNota3.recuperar(8);
		miNota3.getValor();
		System.out.println("Mi nota despues de recuperar es: " + miNota3.getValor());
	}

}
