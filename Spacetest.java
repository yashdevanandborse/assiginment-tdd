package tddtest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tddclass.RemoveSpace;

class Spacetest {

	@Test
	public void spacerempvetest() {

		assertEquals("This Red Car",RemoveSpace.removespacechar("This@Red$Car"));
	}

}
