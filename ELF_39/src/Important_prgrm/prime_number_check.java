package Important_prgrm;

import java.util.Scanner;

public class prime_number_check {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	boolean flag=true;
	for(int i=2;i<=num/2;i++) {
		if(num%i==0) {
			flag=false;
			break;
		}
	}
	if(flag==true) {
		System.out.println("primenumber");
	}
	else {
		System.out.println("nonprime");
	}
}
}
