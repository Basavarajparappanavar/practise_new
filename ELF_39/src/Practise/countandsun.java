package Practise;

import java.util.Scanner;

public class countandsun {
	public static void main(String[] args) {
		Scanner a1=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=a1.nextInt();
		int a=num;
		int count=0;
		int d=0;
		int reverse=0;int e=0;int temp2=num;
		while(num!=0) {
			int b=num%10;
			count++;
			num=num/10;
		}
		System.out.println(count+" is count of number");
		while(a!=0) {
			int reminder=a%10;
			reverse=(reverse*10)+reminder;
			  d=((int)Math.pow(reminder, count));
			  e+=d;
			  a=a/10;
		
			 
	
		}
		System.out.println(e);
		if(temp2==e) {
			System.out.println("it is amstrong");
		}
		else {
			System.out.println("not amstrong");
		}
		
		
		
				
	}

}
