package tddclass;

public class HCF {

	
	public static int factor(int a, int b)
	{
	if (b == 0)
		return a;
	return factor(b, a % b);
	}
	

public static void main(String[] args)
{
	
	}
}
