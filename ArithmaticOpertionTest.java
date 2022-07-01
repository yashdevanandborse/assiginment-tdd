package tddtest;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.internal.Throwables;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import tddclass.ArithmaticOperation;

class ArithmaticOpertionTest {

	private ArithmaticOperation AOP;
	@Rule
	public ExpectedException objexp= ExpectedException.none();
	
	@Test
	public void test() {
		
		assertEquals(5,AOP.Sumoftwono(2, 3));
		assertEquals(10,AOP.Substraction(20, 10));
		assertEquals(12,AOP.Multiplication(6, 2));
		assertEquals(27,AOP.Cube(3));
		assertEquals(9,AOP.Squar(3));
		assertEquals(8,AOP.Power(2, 3));
		
		
	}
	
	@Test
	public void testException()
	{		
		objexp.expect(ArithmeticException.class);
	        objexp.expectMessage(containsString("/ by zero"));
		assertEquals(3,AOP.Division(10, 3));
		assertEquals(2,AOP.Modules(50, 4));
	}
	

}
