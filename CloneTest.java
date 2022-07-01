package tddtest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tddclass.User;

class CloneTest {

	@Test
	void test() throws CloneNotSupportedException{
		
		User u1=new User(1,"Sanjay");
		User u2=(User)u1.Clone();
		
		assertTrue(User.checkClone(u1, u2));
	}



}
