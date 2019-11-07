public class OtrasVidasNoTanEjemplares{
public static void main (String [] args){
	
	Persona Mauricio = new Persona ("Mauricio", "Hombre", 33999776, 70, 1.70);
	Persona Marcos = new Persona ("Marcos", "Hombre", 2315321, 80, 1.75);
	Persona Eugenia = new Persona ("Eugenia", "Mujer", 2154215, 60, 1.69);
	Persona Elisa = new Persona ("Elisa", "Mujer", 63215478, 150, 1.60);
	
		System.out.println(Mauricio.toString());
		System.out.println(Marcos.toString());
		System.out.println(Eugenia.toString());
		System.out.println(Elisa.toString());

		Mauricio.morir();
		System.out.println(Mauricio.toString());
	}
}