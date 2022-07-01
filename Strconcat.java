package tddclass;

public class Strconcat {

	public static String concateArray() {
		
		String[] str= {"apple","banana","orange","lemon"};
		String joinstr = String.join("-", str);
		return joinstr;
	}
}
