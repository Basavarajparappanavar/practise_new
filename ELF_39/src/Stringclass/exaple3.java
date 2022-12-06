package Stringclass;
//declare the string using scanner class and reverse string and check reverse and actual are equal//

import java.util.Scanner;

public class exaple3 {
	public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("enter the name boss");
	String a=s1.next();
	String d="";
for(int i=a.length()-1;i>=0;i--) {
	d=a.charAt(i)+d;
	
}
System.out.println("this is the ans boss");
if(d.equals(a)) {
	System.out.println("palindrome");
}
else {
	System.out.println("not");
}
	
}
}
