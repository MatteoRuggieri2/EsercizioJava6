package esercizi;

public class Main {

	public static void main(String[] args) {
		
		// Creo un'istanza di StringServices
		StringServices stringServices = new StringServices("palla");
		
		// Funzione 1
		if (stringServices.isStringContained("ll")) {
			System.out.println("Funzione 1: Stringa trovata");
		} else {
			System.out.println("Funzione 1: Stringa NON trovata");
		}
		
		// Funzione 2
		System.out.println("Funzione 2: " + stringServices.getStringPos("p"));
		
		// Funzione 3
		System.out.println("Funzione 3: " + stringServices.getString(0, 3));
		
		// Funzione 4
		System.out.println("Funzione 4: " + stringServices.getCharOccurrences('a'));
		
		// Funzione 5
		System.out.println("Funzione 5: " + stringServices.getLastString(3));
		
		// Funzione 6
		System.out.println("Funzione 6: " + stringServices.insertString("Sono una ", 0));
		
		// Funzione 7
		System.out.println("Funzione 7: " + stringServices.deleteString(2, 3));
	}

}
