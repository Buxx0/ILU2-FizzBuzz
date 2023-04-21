package ilu2;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WelcomeTest {

	@Test
	void testBob() {
		assertTrue(Welcome.welcome("bob").equals("Hello, Bob"));
	}
	
	@Test
	void testChaineVide() {
		assertTrue(Welcome.welcome(null).equals("Hello, my friend"));
		assertTrue(Welcome.welcome("   ").equals("Hello, my friend"));
	}
	
	@Test
	void testGestionCris() {
		assertTrue(Welcome.welcome("JERRY").equals("HELLO, JERRY !"));
	}
	
	@Test
	void testGestionDeuxNoms() {
		assertTrue(Welcome.welcome("amy,bob").equals("Hello, Amy, Bob"));
	}
	
	@Test
	void testGestionPlusieursNoms() {
		assertTrue(Welcome.welcome("amy,bob,jerry").equals("Hello, Amy, Bob, Jerry"));
	}
}
