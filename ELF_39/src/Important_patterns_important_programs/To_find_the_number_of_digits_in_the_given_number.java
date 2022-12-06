package Important_patterns_important_programs;

import java.util.Scanner;

public class To_find_the_number_of_digits_in_the_given_number {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int a=sc.nextInt();int count=0;
	for(int i=0;a!=0;i++) {
		count++;
		a=a/10;
	}
	System.out.println(count);
}
}
