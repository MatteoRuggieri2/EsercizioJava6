package esercizi;

import java.util.InputMismatchException;

public class StringServices {
	
	private String miaFrase;
	
	public String getMiaFrase() {
		return this.miaFrase;
	}
	
	public StringServices(String stringa) {
		this.miaFrase = stringa;
	}
	
	/* Questa funzione controlla se la stringa passata è
	 * contenuta all'interno della frase (oggeto su cui abbiamo usato il metodo) */
	public boolean isStringContained(String str) {
		return miaFrase.contains(str);
	}
	
	/* Questo metodo cerca la stringa passata all'interno della frase (oggetto su
	 * cui abbiamo usato il metodo) e ritorna la posizione (in indice).
	 * Se non trova nessuna occorrenza della stringa ritorna "-1" */
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
			if (miaFrase.toLowerCase().charAt(i) == Character.toLowerCase(chrInp)) {
				charCounter++;
			}
		}
		
		return charCounter;
	}
	
	/* Questa funzione mi restituisce tutte le lettere partendo
	 * dall'indice passato come argomento */
	public String getLastString(int posStart) throws StringIndexOutOfBoundsException {
		
		if (posStart < 0 || posStart > this.miaFrase.length() - 1) {
			throw new StringIndexOutOfBoundsException("Message: Index \"" + posStart + "\" was not found in the string");
		}
		
		return miaFrase.substring(posStart);
	}

	/* Questa funzione ha il compito di inserire una stringa dentro
	 * un'altra stringa, passando come parametro l'indice di partenza */
	public String insertString(String strInp, int posStart) throws StringIndexOutOfBoundsException {
		
		if (posStart < -1 || posStart > this.miaFrase.length() - 1) {
			throw new StringIndexOutOfBoundsException("Message: Index \"" + posStart + "\" was not found in the string");
		}
		
		if (posStart == -1) {
			return this.miaFrase + strInp;
		}
		
		String resultQuote = "";
		
		for (int i = 0; i < this.miaFrase.length(); i++) {
			char currentChar = this.miaFrase.charAt(i);
			if (posStart == i) {
				resultQuote += strInp;
			}
			resultQuote += currentChar;
		}
		
		return resultQuote;
	}

	/* Questa funzione elimina un pezzo di stringa dall'indice di partenza "posStart"
	 * all'indice di fine "posEnd" */
	public String deleteString(int posStart, int posEnd) {
		
		if (posStart < 0 || posStart > this.miaFrase.length() - 1 || posEnd < 0 || posEnd > this.miaFrase.length() - 1) {
			throw new StringIndexOutOfBoundsException("The index \"posStart: " + posStart + "\" or \"posEnd: " + posEnd + "\" was not found in the string");
		} else if (posStart > posEnd) {
			throw new IllegalArgumentException("The \"posStart\" argument cannot be larger than \"posEnd\".");
		}
		
		String resultQuote = "";
		
		for (int i = 0; i < this.miaFrase.length(); i++) {
			char currentChar = this.miaFrase.charAt(i);
			if (i < posStart || i > posEnd) {
				resultQuote += currentChar;
			}
		}
		
		
		return resultQuote;
	}
	
	/* Questa funzione, data una stringa composta da più parole, 
	 * mi restituisce un array con ogni parola. */
	public String[] getWordsArray() {
		return this.miaFrase.split(" ");
	}
	
	/* Questa funzione ritorna una stringa composta dal carattere
	 * fornito come parametro per tante volte quante numRepeat  */
	public String getRepeatedChar(char chr, int numRepeat) {
		
		if (numRepeat > 2147483647) {
			throw new InputMismatchException("\"numRepeat: " + numRepeat + "\" must be maximum of 2147483647");
		}
		
		String result = "";
		
		if (numRepeat <= 0) {
	        return result;
	    }
		
	    for (int i = 0; i < numRepeat; i++) {
			result += chr;
		}
	    
	    return result;
	}
}