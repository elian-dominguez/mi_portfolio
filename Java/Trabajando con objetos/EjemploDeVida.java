
public class EjemploDeVida{
public static void main (String [] args){
	
	Persona sofia;
	
	sofia = new Persona ("Sofía", "Mujer", 38432153,  2.8, 0.50);
	
	System.out.println (sofia.toString());
	
	sofia.alimentar (1.0);
	sofia.crecer (0.5);
	sofia.cumplirAnos();
	
	System.out.println (sofia.toString());
	
	}
}