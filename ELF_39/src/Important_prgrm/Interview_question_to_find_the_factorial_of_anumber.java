package Important_prgrm;

import java.util.Scanner;

public class Interview_question_to_find_the_factorial_of_anumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number you want to find the factorial");
	int num=sc.nextInt();
	int fact=1;
	for(int i=num;i>=1;i--) {
		fact*=i;
	}

	System.out.println(fact+" "+"factorial value of the given number");
}
}
