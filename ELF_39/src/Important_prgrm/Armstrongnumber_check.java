package Important_prgrm;

import java.util.Scanner;

public class Armstrongnumber_check {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number boss");
	int num=sc.nextInt();
	int actual=num;
	int given=num;
	int count=0;int sum=0;
	for(int i=0;num!=0;i++) {
		count++;
		num/=10;
	}
	for(int i=0;given!=0;i++) {
		int reminder=given%10;
		int exponent=(int)Math.pow(reminder, count);
		sum+=exponent;
		given/=10;
	}
	if(sum==actual) {
		System.out.println("Armstrong_number");
	}
	else {
		System.out.println("not_armstrong");
	}
	
}
}
