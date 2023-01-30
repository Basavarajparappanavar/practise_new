package Important_prgrm;

import java.util.Scanner;

public class palindrome_number_check {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int actual=num;int reverse=0;
	for(int i=0;num!=0;i++) {
		int reminder=num%10;
		reverse=reverse*10+reminder;
		num/=10;
	}
	if(reverse==actual) {
		System.out.println("palindrome");
		
	}
	else {
		System.out.println("not a palindrome");
	}
	
}
}
