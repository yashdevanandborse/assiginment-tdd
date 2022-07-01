package tddclass;

public class Palindrome {

	
	public boolean isPalindrome(String str1) {
		
		String newStr = " ";
		
		for(int i = str1.length()-1; i >= 0 ; i--) {
	newStr =newStr + str1.charAt(i);
		}
		if(str1.equals(newStr)) 
			//System.out.println("String is palindrome");
		return true;
		else 
			//System.out.println("String is not palindrome");
		
		return false;
	}
	
	
	
}



