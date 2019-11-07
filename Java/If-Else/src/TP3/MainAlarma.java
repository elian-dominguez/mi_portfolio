package TP3;

public class MainAlarma {

	public static void main(String[] args) {
		Alarma miAlarma = new Alarma(123);
		Alarma miAlarma2 = new Alarma(321);

		miAlarma.encender(123);
		miAlarma.apagar();
		boolean estado = miAlarma.activada();

		if (estado == true) {
			System.out.println("La alarma esta encendida");
		}
		if (estado == false) {

			System.out.println("La alarma esta apagada");
		}

		miAlarma2.encender(321);
		miAlarma2.apagar();
		miAlarma2.encender(321);
		boolean estado2 = miAlarma2.activada();

		if (estado2 == true) {
			System.out.println("La segunda alarma esta encendida");
		}
		if (estado2 == false) {
			System.out.println("La segunda alarma esta apagada");
		}
	}
}
