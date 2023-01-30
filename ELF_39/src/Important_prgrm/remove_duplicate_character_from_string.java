package Important_prgrm;

import java.util.Scanner;

public class remove_duplicate_character_from_string {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	char[] s1=s.toCharArray();
	String result="";
	for(int i=0;i<s1.length;i++) {
		if(result.indexOf(s1[i])==-1) {
			result=result+s1[i];
		}
	}
	System.out.println(result);
}
}
