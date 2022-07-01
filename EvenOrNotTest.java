package tddtest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tddclass.EvenOrNot;

class EvenOrNotTest {

	private EvenOrNot even;
	
	@Test
	public void testeven() {
		assertTrue(even.noiseven(new int[] {2,5,6,9}));
	}
//	@Test
//	public void testnoteven() {
//		assertFalse(even.noiseven(new int[] {2,4,6,8}));
//	}

}
