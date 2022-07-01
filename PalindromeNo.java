package tddclass;

public class PalindromeNo {


	public static boolean numpalindrome(int n) {
		int sum = 0, r;
		int temp = n;    
		while(n>0)
		{    
			r = n % 10;   
			sum = (sum*10)+r;    
			n = n/10;    
		}    
		if(temp==sum)    
	//System.out.println("It is a Palindrome number.");    
		return true;
			else    
			//System.out.println("Not a palindrome");
		return false;    
	}
	public static void main(String args[])
	{

	}  
}