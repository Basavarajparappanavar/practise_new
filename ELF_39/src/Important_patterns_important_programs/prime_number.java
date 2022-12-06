package Important_patterns_important_programs;

import java.util.Scanner;

public class prime_number {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the range");
	int start=sc.nextInt();
	int end=sc.nextInt();
	for(int num=start;num<=end;num++) {
		boolean flag=true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
			flag=false;
		}
	}
	if(flag==true) {
		System.out.println(num);
	}
}
}
}
