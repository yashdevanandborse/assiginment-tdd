package tddclass;

public class Vovel {

	static int count=0;
	public static int CountVovel(String str) {
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				
				count++;
			}
		}
		return count;
		
	}
}
