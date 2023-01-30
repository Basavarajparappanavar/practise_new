package Stringclass;

public class String_swap {
public static void main(String[] args) {
	
	String str1="rakesh",str2="Basavaraj";
	str1 = str1 + str2;
	str2=str1.substring(0,str1.length()-str2.length());
	System.out.println(str2);
	str1=str1.substring(str2.length());
	System.out.println(str1);
	
	
}
}