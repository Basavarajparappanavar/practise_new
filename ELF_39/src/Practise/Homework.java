package Practise;
import java.util.Scanner;
public class Homework {
	public static void main(String[] args) {
		Scanner a1=new Scanner(System.in);
		System.out.println("Enter the range of values");
		int start=a1.nextInt();
		int end =a1.nextInt();
		int sum=0;int primesum=0;
		boolean c=true;
		for(int j=start;j<=end;j++) {
			int num=j;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				c=false;
				System.out.println(num);
				sum=sum+num;
				break;
			}
		}
		}
		System.out.println(sum);
	}
	
	}
		

