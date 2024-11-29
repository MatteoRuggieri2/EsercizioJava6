package esercizi;

import java.io.IOException;
import interfaces.StreamParole;

//import java.util.Iterator;

public class StringServices implements StreamParole {
	
	private String miaFrase;
	
	public StringServices(String stringa) {
		this.miaFrase = stringa;
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
	public String insertString(String strInp, int posStart) throws StringIndexOutOfBoundsException {
		//	Frase che dovrei ottenere: ciao sono matteo
		
		if (posStart < -1 || posStart > this.miaFrase.length() - 1) {
			throw new StringIndexOutOfBoundsException();
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
//	
	/* Questa funzione elimina un pezzo di stringa dall'indice di partenza "posStart"
	 * all'indice di fine "posEnd" */
	public String deleteString(int posStart, int posEnd) {
		/* Faccio un CICLO FOR dove per ogni lettera, se l'indice è compreso
		 * tra "posStart" e "posEnd" lo rimuovo con miaStringa.replace(char, "") */
		
		if (posStart < 0 || posStart > this.miaFrase.length() - 1 || posEnd < 0 || posEnd > this.miaFrase.length() - 1) {
			throw new StringIndexOutOfBoundsException();
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
		String result = "";
		
		if (numRepeat <= 0) {
	        return result;
	    }
		
	    for (int i = 0; i < numRepeat; i++) {
			result += chr;
		}
	    
	    return result;
	}

	@Override
	public long countAll() throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String[] parole() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count(String parola) throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String parolaMax() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] paroleLenghtLessThen(int numChar) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String paroleJoined() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}
}
