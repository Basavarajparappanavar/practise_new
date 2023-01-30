package Important_prgrm;

import java.util.Scanner;

public class remove_duplicate_from_string {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the String");
	String s=sc.nextLine();
	String result="";
	String s1[]=s.split(" ");
	for(int i=0;i<s1.length;i++) {
		if(!result.contains(s1[i])) {
			result=result+s1[i]+" ";
		}
	}
	result.trim();
	System.out.println(result);
}
}
