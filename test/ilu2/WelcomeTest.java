package ilu2;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WelcomeTest {
	
	@BeforeEach
	public void setup() {
		Welcome welcome = new Welcome();
	}

	@Test
	void testBob() {
		assertTrue(Welcome.welcome("bob").equals("Hello, Bob"));
	}

}
