package Important_patterns_important_programs;

import java.util.Scanner;

public class counting_even_and_odd_in_the_given_range {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the starting point");
	int start=sc.nextInt();
	System.out.println("Enter the ending point");
	int end =sc.nextInt();
	int oddcount=0;int evencount=0;
	for(int i=start;i<=end;i++) {
		if(i%2==0) {
			evencount++;
		}
		else {
			oddcount++;
		}
	}
	System.out.println(evencount);
	System.out.println(oddcount);
	sc.close();
}
}
