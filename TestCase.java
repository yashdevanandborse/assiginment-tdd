package tddtest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tddclass.HCF;

class TestCase {

	@Test
	
	public void testhcf() {
		assertEquals(14,HCF.factor(98,56));
		
	}

}
