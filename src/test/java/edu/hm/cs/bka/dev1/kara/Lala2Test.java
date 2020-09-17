package edu.hm.cs.bka.dev1.kara;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Lala2Test {

	@Test
	public void failingTest() {
		Assertions.assertEquals(4, 5, "Is nicht dasselbe");
	}
	
	@Test
	public void succeedingTest() {
		// it's fine ;)
	}
}
