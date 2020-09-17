package edu.hm.cs.bka.dev1.kara;
import org.junit.jupiter.api.Test;

public class LalaTest {

	@Test
	public void failingTest() {
		throw new RuntimeException();
	}
	
	@Test
	public void succeedingTest() {
		// it's fine ;)
	}
}
