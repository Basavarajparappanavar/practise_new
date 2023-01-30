package Stringclass;

public class add_number_in_string {
public static void main(String[] args) {
	String s="Basav";
	String s1="raj";
	s=s+s1;
	s1=s.substring(s.length()-1,s1.length()-1);
	System.out.println(s1);
}
}
