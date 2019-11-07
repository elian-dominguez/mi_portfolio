package tp4;

public class Dia {
	private int dia;

	public String semana(int opc) {
		switch (opc) {
		case 1:
			return "Domingo";
		case 2:
			return "Lunes";
		case 3:
			return "Martes";
		case 4:
			return "Miercoles";
		case 5:
			return "Jueves";
		case 6:
			return "Viernes";
		case 7:
			return "Sabado";
		}
		return null;
	}
}
