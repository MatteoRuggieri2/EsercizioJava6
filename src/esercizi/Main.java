package esercizi;

public class Main {

	public static void main(String[] args) {
		
		// Creo un'istanza di StringServices
		StringServices stringServices = new StringServices("Palla da calcio");
		
		// Funzione 1
		if (stringServices.isStringContained("ll")) {
			System.out.println("Funzione 1: Stringa trovata");
		} else {
			System.out.println("Funzione 1: Stringa NON trovata");
		}
		
		// Funzione 2
		System.out.println("Funzione 2: " + stringServices.getStringPos("l"));
		
		// Funzione 3
		System.out.println("Funzione 3: " + stringServices.getString(0, 3));
		
		// Funzione 4
		System.out.println("Funzione 4: " + stringServices.getCharOccurrences('a'));
		
		// Funzione 5
		System.out.println("Funzione 5: " + stringServices.getLastString(3));
		
		// Funzione 6
		System.out.println("Funzione 6: " + stringServices.insertString(" da calcio ", -1));
		
		// Funzione 7
		System.out.println("Funzione 7: " + stringServices.deleteString(2, 3));
		
		// Funzione 8
		System.out.println("Funzione 8: ");
		String[] words = stringServices.getWordsArray();
		for (int i = 0; i < words.length; i++) {
			System.out.println("- " + words[i]);
		}
		
		// Funzione 9
		System.out.println("Funzione 9: " + stringServices.getRepeatedChar('a', 3));
	}

}
