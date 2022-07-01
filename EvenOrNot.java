package tddclass;

public class EvenOrNot {

	public static boolean noiseven( int a[]) {
		
		boolean ans=false;
		for(int i=0;i<a.length;i++)
		{
			
		if(a[i]%2==0)
			return true;
			//System.out.println("it is even");
//		else 
//			return false;
			//System.out.println("It is not even");
		}
	return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
