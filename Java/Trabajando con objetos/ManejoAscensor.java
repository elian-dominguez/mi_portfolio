public class ManejoAscensor{
public static void main (String [] args){

Ascensor consorcioCallePeron = new Ascensor (4, 150.0);

System.out.println(consorcioCallePeron.getPisoActual());
//System.out.println(consorcioCallePeron.toString());
consorcioCallePeron.cerrarPuerta();
consorcioCallePeron.subir();
consorcioCallePeron.subir();
consorcioCallePeron.subir();
System.out.println(consorcioCallePeron.getPisoActual());
Persona p1 = new Persona ("Sofia", "Femenino", 11111, 60.0, 1.60);
Persona p2 = new Persona ("Elian", "Hombre", 222222, 80, 1.75);
Persona p3 = new Persona ("Sergio", "Hombre", 333333, 90.0, 1.85);

consorcioCallePeron.abrirPuerta();
consorcioCallePeron.ingresar(p1);
consorcioCallePeron.ingresar(p2);
//consorcioCallePeron.ingresar(p3);
consorcioCallePeron.cerrarPuerta();

consorcioCallePeron.subir();
	}
}



