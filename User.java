package tddclass;

public class User implements Cloneable{
	
	int uid;
	String uname;
	public User(int uid,String uname) {
		
		this.uid=uid;
		this.uname=uname;
		
	}
	public Object Clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public static boolean checkClone(User u1,User u2) {
		if(u1.uid==u2.uid && u1.uname==u2.uname)
			return true;
		else 
			return false;
	}

}
