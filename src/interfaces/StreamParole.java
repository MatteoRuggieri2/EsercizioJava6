package interfaces;

import java.io.IOException;

public interface StreamParole {

	/* Restituisce il numero di parole presenti */
	long countAll() throws IOException;
	
	/* Restituisce tutte le parole presenti nel file */
	String[] parole() throws IOException;
	
	/* Restituisce il numero di occorrenze della parola*/
	long count(String parola) throws IOException;
	
	/* Restituisce la parola alfabeticamente più grande*/
	String parolaMax() throws IOException;
	
	/* Restituisce tutte le parole con meno di n caratteri */
	String[] paroleLenghtLessThen(int numChar) throws IOException;
	
	/* Restituisce una unica stringa con tutte le parole*/
	String paroleJoined() throws IOException;

}
