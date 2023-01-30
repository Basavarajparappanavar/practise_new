package Stringclass;

public class palindrome {
public static void main(String[] args) {
	String s="hi hi hello hi";
	String s2[]=s.split(" ");
	String s3="";
	for(int i=0;i<s2.length;i++) {
		if(!s3.contains(s2[i])) {
			s3=s3+s2[i]+" ";
		}
	}
	System.out.println(s3);
			
}
}
