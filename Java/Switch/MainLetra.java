package tp4;

public class MainLetra {

	public static void main(String[] args) {

		Letra miLetra = new Letra('z');

		boolean vocal = miLetra.esVocal();
		if (vocal == true) {
			System.out.println("Mi letra es vocal");
		} else {
			System.out.println("Mi letra no es vocal");
		}
	}
}
