package ENCAPSULATION;

public class LOGINACCOUNT {
	String givenName="BASAVARAJ";
	int givenpassword=12345;
	private String enteredName;
	private int enteredpassword;
	LOGINACCOUNT(String enteredName,int enteredpassword ){
		this.enteredName=enteredName;
		this.enteredpassword=enteredpassword;
	}
	public String getName() {
		if(givenName==enteredName&&givenpassword==enteredpassword) { 
			String c="loginsuccessful";
		return c;
	}
		else { 
			String d="loginfailed";
			return d;
		}
		
	}
	public void setName(String Name) {
		Name=Name;
	}

}
