package Important_patterns_important_programs;

import java.util.Scanner;

public class Multiples_of_four_table {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	for(int i=1;i<=10;i++) {
		System.out.println(num+"*"+i+"="+num*i);
		
	}
	sc.close();
}
}
