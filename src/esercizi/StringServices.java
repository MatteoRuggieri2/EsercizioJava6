package esercizi;

//import java.util.Iterator;

public class StringServices {
	
	private String miaFrase;
	
	public StringServices(String stringa) {
		miaFrase = stringa;
	}
	
	/* Questa funzione controlla se la stringa passata è
	 * contenuta all'interno della frase (oggeto su cui abbiamo usato il metodo) */
	public boolean isStringContained(String str) {
		return miaFrase.contains(str);
	}
	
	/* Questo metodo cerca la stringa passata all'interno della frase (oggetto su
	 * cui abbiamo usato il metodo) e ritorna la posizione (in indice) */
	public int getStringPos(String str) {
		return miaFrase.indexOf(str);
	}
	
	/* Questa funzione ha il compito di, dati l'indice di inizio e di fine, di 
	 * prendere la porzione di frase che abbiamo selezionato */
	public String getString(int posStart, int posEnd) {
		return miaFrase.substring(posStart, posEnd);
	}
	
	/* Questa funzione serve a calcolare quante volte un carattere
	 * è presente in una stringa */
	public int getCharOccurrences(char chrInp) {
		int charCounter = 0;
		
		// Per ogni carattere, se è uguale a quello passato aumento il counter
		for (int i = 0; i < miaFrase.length(); i++) {
			if (miaFrase.charAt(i) == chrInp) {
				charCounter++;
			}
		}
		
		return charCounter;
	}
	
	/* Questa funzione mi restituisce tutte le lettere partendo
	 * dall'indice passato come argomento */
	public String getLastString(int posStart) {
		return miaFrase.substring(posStart);
	}

	/* Questa funzione ha il compito di inserire una stringa dentro
	 * un'altra stringa, passando come parametro l'indice di partenza */
	public String insertString(String strInp, int posStart) {
		String defaultQuote = "ciao matteo";
		//	Frase che dovrei ottenere: ciao sono matteo
		
		String resultQuote = "";
		
		for (int i = 0; i < defaultQuote.length(); i++) {
			defaultQuote.charAt(i);
			System.out.println(defaultQuote);
			if (i == posStart) {
				
			}
		}
		
		return resultQuote;
		
		/* Faccio un CICLO FOR dove se l'indice del ciclo è uguale a "posStart
		 * CONCATENO (+=) la scringa passata come parametro (strInp) */
	}
//	
	/* Questa funzione elimina un pezzo di stringa dall'indice di partenza "posStart"
	 * all'indice di fine "posEnd" */
//	public String deleteString(int posStart, int posEnd) {
		/* Faccio un CICLO FOR dove per ogni lettera, se l'indice è compreso
		 * tra "posStart" e "posEnd" lo rimuovo con miaStringa.replace(char, "") */
//	}
//	
	/* Questa funzione, data una stringa composta da più parole, 
	 * mi restituisce un array con ogni parola. */
//	public String getWordsArray() {
		/* Devo usare una funzione che mi divide una frase con un carattere 
		 * che gli do io, e mi mette tutte le parole in un array.
		 * Devo usare tipo splice multiplo */
//	}
//	
	/* Questa funzione ritorna il numero di caratteri ripetuti */
//	public int getRepeatedChar(char chr, int numRepeat) {
//		
//	}
}
