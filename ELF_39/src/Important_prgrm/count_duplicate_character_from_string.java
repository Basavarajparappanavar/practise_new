package Important_prgrm;

import java.util.Scanner;

public class count_duplicate_character_from_string {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string boss");
	String s=sc.nextLine();
	System.out.println("enter the letter tocount ");
	char d=sc.next().charAt(0);int count=0;
	char s1[]=s.toCharArray();
	for(int i=0;i<s1.length;i++) {
		if(s1[i]==d) {
			count++;
		}
	}
	System.out.println(count);
}
}
