package tp4;

public class Letra {

	private char letra;
	private boolean vocal;

	public Letra(char letra) {
		this.letra = letra;
	}

	public boolean esVocal() {
		switch (letra) {
		case 'a':
			return vocal = true;
		case 'e':
			return vocal = true;
		case 'i':
			return vocal = true;
		case 'o':
			return vocal = true;
		case 'u':
			return vocal = true;
		default :
			return vocal = false;
		}
	}

}
