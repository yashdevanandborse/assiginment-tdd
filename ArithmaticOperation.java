package tddclass;
import java.util.Scanner;

public class ArithmaticOperation {

	
	public static int Sumoftwono(int a,int b) {
		
		int sum = a+b;
		return sum;
		
	}
	public static int Substraction(int a,int b) {
		int sub = a-b;
		return sub;
		
	}
	public static int Multiplication(int a,int b) {
		int mul = a*b;
		return mul;
		
	}
	public static int Division(int a,int b)
	{
		int div = a/b;
		return div;
		
	}
	public static int Modules(int a,int b) {
		
		int divided = a / b;
		int result = a - (divided * b);
		return result;
		
	}
public static int Power(int N,int P) {

    int pow = 1;
    for (int i = 1; i <= P; i++)
        pow *= N;
    return pow;

}
	public static int Squar(int a)
	{
		
		if (a < 0) {
		    throw new IllegalArgumentException();
		}
		int sqr=a*a;
		return sqr;
		
		
	}
	
	public static int Cube(int a) {
		
		if (a < 0) {
		    throw new IllegalArgumentException();
		}
		int cube=a*a*a;
		return cube;
		
	}
}
	




