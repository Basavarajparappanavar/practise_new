package Important_patterns_important_programs;

import java.util.Scanner;

public class palindrome {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter range");
	int start=sc.nextInt();int end=sc.nextInt();
	for(int i=start;i<=end;i++) {
		int num=i;
	int reverse=0;
	int temp=num;
	for(int j=0;num!=0;j++){
		int reminder=num%10;
		reverse=(reverse*10)+reminder;
		num/=10;
	}
	if(reverse==temp) {
		System.out.println(temp);
	}
	
}
}
}
