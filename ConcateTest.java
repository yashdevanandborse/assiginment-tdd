package tddtest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tddclass.Strconcat;

class ConcateTest {

	@Test
	public void testconcate() {
		assertEquals("apple-banana-orange-lemon",Strconcat.concateArray());
	}

}
