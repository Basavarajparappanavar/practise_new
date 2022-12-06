package Practise;
import java.util.Scanner;
public class A13 {
	public static void main(String[] args) {
		Scanner r1=new Scanner(System.in);
		System.out.println("Enter the range of values");
		int start=r1.nextInt();
		int end=r1.nextInt();
		int sum=0;
		int count=0;
		for(int i=start;i<end;i++) {
			boolean c=true;
			int num=i;
			for(int j=2;j<num;j++) {
				if(num%j==0) {
					c=false;
					
				}
			}
			if(c==true) {
				count++;
				sum+=num;
			}
			else {
		System.out.println(num+"non prime");
				
			}
		}
		System.out.println(sum+"is the sum");
	System.out.println(count+"is the count");		
	}

}
