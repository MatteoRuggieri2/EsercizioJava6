package esercizi;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringServicesTest {
	
	StringServices stringServices;
	
	@BeforeEach
	void setUpBeforeEach() {
		stringServices = new StringServices("Ciao, sono Matteo!");
	}
	
	@Test
	void testIsStringContained() {
		assertTrue(stringServices.isStringContained("Matteo"));
		assertTrue(stringServices.isStringContained(" "));
		assertTrue(stringServices.isStringContained(","));
		assertTrue(stringServices.isStringContained("!"));
		assertFalse(stringServices.isStringContained("ciao"));
		assertFalse(stringServices.isStringContained("matteo"));
	}
	
	@Test
	void testGetStringPos() {
		assertEquals(0, stringServices.getStringPos("C"));
		assertEquals(-1, stringServices.getStringPos("c"));
		assertEquals(5, stringServices.getStringPos(" "));
		assertEquals(0, stringServices.getStringPos(""));
		assertEquals(11, stringServices.getStringPos("Matteo"));
		assertEquals(17, stringServices.getStringPos("!"));
		assertEquals(-1, stringServices.getStringPos("z"));
	}
	
	@Test
	void testGetString() {
		assertEquals("Ciao", stringServices.getString(0, 4));
		assertEquals("sono", stringServices.getString(6, 10));
		assertEquals("Matteo", stringServices.getString(11, 17));
		assertEquals(", ", stringServices.getString(4, 6));
		assertEquals("!", stringServices.getString(17, 18));
		assertEquals("C", stringServices.getString(0, 1));
		assertThrows(IndexOutOfBoundsException.class, () -> stringServices.getString(-1, 100));
	}
	
	@Test
	void testGetCharOccurrences() {
		assertEquals(1, stringServices.getCharOccurrences('C'));
		assertEquals(1, stringServices.getCharOccurrences('c'));
		assertEquals(4, stringServices.getCharOccurrences('o'));
		assertEquals(2, stringServices.getCharOccurrences(' '));
		assertEquals(1, stringServices.getCharOccurrences('!'));
	}
	
	@Test
	void testGetLastString() {
		assertEquals("Ciao, sono Matteo!", stringServices.getLastString(0));
		assertEquals("!", stringServices.getLastString(17));
		assertEquals("Matteo!", stringServices.getLastString(11));
		assertThrows(StringIndexOutOfBoundsException.class, () -> stringServices.getLastString(-20));
		assertThrows(StringIndexOutOfBoundsException.class, () -> stringServices.getLastString(100));
	}
	
	@Test
	void testInsertString() {
		assertEquals("Ciao Ciao, sono Matteo!", stringServices.insertString("Ciao ", 0));
		assertEquals("Ciao bello, sono Matteo!", stringServices.insertString(" bello", 4));
		assertEquals("Ciao, sono Matteo! (Questo era un saluto)", stringServices.insertString(" (Questo era un saluto)", -1));
		assertThrows(StringIndexOutOfBoundsException.class, () -> stringServices.getLastString(100));
	}
	
	@Test
	void testDeleteString() {
		assertEquals("Ciao Matteo!", stringServices.deleteString(4, 9));
		assertEquals("", stringServices.deleteString(0, stringServices.getMiaFrase().length() - 1));
		assertThrows(IllegalArgumentException.class, () -> stringServices.deleteString(2, 0));
		assertThrows(StringIndexOutOfBoundsException.class, () -> stringServices.deleteString(-2, 0));
		assertThrows(StringIndexOutOfBoundsException.class, () -> stringServices.deleteString(0, -2));
		assertThrows(StringIndexOutOfBoundsException.class, () -> stringServices.deleteString(200, 8));
		assertThrows(StringIndexOutOfBoundsException.class, () -> stringServices.deleteString(8, 200));
	}
	
	@Test
	void testGetWordsArray() {
		String[] resultArray = {"Ciao,", "sono", "Matteo!"};
		assertArrayEquals(resultArray, stringServices.getWordsArray());
		
	}
	
	@Test
	void testGetRepeatedChar() {
		assertEquals("aaaaa", stringServices.getRepeatedChar('a', 5));
		assertEquals(":::::", stringServices.getRepeatedChar(':', 5));
		assertEquals("     ", stringServices.getRepeatedChar(' ', 5));
	}

}

















