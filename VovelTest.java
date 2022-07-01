package tddtest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tddclass.Vovel;

class VovelTest {

	@Test
	public void matchvovel(){
	
		assertEquals(3,Vovel.CountVovel("youraj"));
	
	}


	
}
