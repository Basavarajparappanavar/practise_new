package Important_prgrm;

import java.util.HashSet;
import java.util.LinkedList;

public class linklist_to_hashset {
public static void main(String[] args) {
	String s="boby";String s1="";
	for(int i=s.length()-1;i>=0;i--) {
		s1=s1+s.charAt(i);
	}
	if(s.equalsIgnoreCase(s1)) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("not");
	}
}
}
