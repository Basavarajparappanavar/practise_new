package Stringclass;

public class assignment4 {
	public static void main(String[] args) {
		String s1="My name is Ram";
		String s2[]=s1.split(" ");String d="";
		for(int i=s2.length-1;i>=0;i--) {
		 d=d+" "+s2[i];
		}
		System.out.print(d);
	}

}
