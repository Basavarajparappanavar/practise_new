package Practise;

import java.util.Scanner;

public class char_count {
public static void main(String[]args) {
	 
	 String s="My name is basavaraj";
	 String s2[]=s.split(" ");String result="";
	 for(int i=0;i<s2.length;i++) {
		for(int j=s2[i].length()-1;j>=0;j--) {
			result+=s2[i].charAt(j);
		
		}
		result=
				result+" ";
		 }
	 System.out.println(result);
	 
	 
	
	}
}
		
	





