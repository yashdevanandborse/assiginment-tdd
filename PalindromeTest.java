package tddtest;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tddclass.Palindrome;
import tddclass.PalindromeNo;

class PalindromeTest {

	 private Palindrome palindrome;
  //  private String str;
	  
	    private PalindromeNo palindromeno;

	 @Test
	    public void validPalindromeTest() throws Exception {

	     //   str = "NITIN";
	      

	        assertTrue(palindrome.isPalindrome("nitin"));
	       // assertTrue(palindrome.newStr(toString));
	    }
//
//	    @Test
//	    public void invalidPalindromeTest() throws Exception {
//
//	        str= "I am a tester";
//
//	        assertFalse(palindrome.isPalindrome(str));
//	    }
	   
	    
	    
	 @Test
	 public void noispalindrome() {
		 
		 assertTrue(palindromeno.numpalindrome(5),()->"It is a Palindrome number.");
	 }
	 @Test
	 public void noisnotpalindrome() {
		 assertFalse(palindromeno.numpalindrome(35),()->"Not a palindrome.");
	 }
	 
	  
}
