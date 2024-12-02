package esercizi;

public class Main {

	public static void main(String[] args) {
		
		// Creo un'istanza di StringServices
		StringServices stringServices = new StringServices("Ciao, sono Matteo!");
		
		// Funzione 1
		if (stringServices.isStringContained("ll")) {
			System.out.println("Funzione 1: Stringa trovata");
		} else {
			System.out.println("Funzione 1: Stringa NON trovata");
		}
		
		// Funzione 2
		System.out.println("Funzione 2: " + stringServices.getStringPos("C"));
		
		// Funzione 3
		System.out.println("Funzione 3: " + stringServices.getString(0, 4));
		
		// Funzione 4
		System.out.println("Funzione 4: " + stringServices.getCharOccurrences('o'));
		
		// Funzione 5
		System.out.println("Funzione 5: " + stringServices.getLastString(6));
		
		// Funzione 6
		System.out.println("Funzione 6: " + stringServices.insertString(" : )", 17));
		
		// Funzione 7
		System.out.println("Funzione 7: " + stringServices.deleteString(0, 5));
		
		// Funzione 8
		System.out.println("Funzione 8: ");
		String[] words = stringServices.getWordsArray();
		for (int i = 0; i < words.length; i++) {
			System.out.println("- '" + words[i] + "'");
		}
		
		// Funzione 9
		System.out.println("Funzione 9: " + stringServices.getRepeatedChar('a', 2147483647));
	}

}
