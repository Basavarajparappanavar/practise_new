package Important_prgrm;

import java.util.Scanner;

public class to_print_largest_string {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String s= sc.nextLine();
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++) {
			for(int j=i+1;j<s1.length;j++) {
				if(s1[i].length()>s1[j].length()) {
					String temp=s1[i];
					s1[i]=s1[j];
					s1[j]=temp;
				}
			}
		}
		for(int i=0;i<s1.length;i++) {
			System.out.println(s1[i]);
		}
		System.out.println(s1[0]+"smallest string");
		System.out.println(s1[s1.length-1]+" largest string");
	}

}
