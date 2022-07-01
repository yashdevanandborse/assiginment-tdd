package tddclass;

public class RemoveSpace {

	public static String removespacechar(String str) {
		
		str=str.replaceAll("[^a-zA-Z0-9]", " ");
		return str;
	}
}
