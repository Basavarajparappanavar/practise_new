package Stringclass;

public class assignment3 {
	public static void method(String s1) {
		String s2="";
		for(int i=0;i<s1.length();i++) {
			char c=s1.charAt(i);
			if(s2.indexOf(c)==-1) {
				s2=s2+c;
			}
			
		}
		System.out.println(s2);
	}
	public static void main(String[] args) {
		method("AABBCCDD");
		
	}

}
