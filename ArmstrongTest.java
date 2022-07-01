package tddtest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tddclass.NoArmstrong;

class ArmstrongTest {

	private NoArmstrong armstrong;
	
     @Test
	public void noisarmstrong() {
	
		assertTrue(armstrong.isArmstrong(2));
	}
     @Test
     public void noisnotarmstrong() {
    	 assertFalse(armstrong.isArmstrong(64));
     }
}
