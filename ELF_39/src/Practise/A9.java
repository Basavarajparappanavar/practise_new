package Practise;
import java.util.Scanner;
public class A9 {
	public static void main(String[] args) {
		Scanner a1=new Scanner (System.in);
		int a=a1.nextInt();
		A9 r1=new A9();
		r1.count(a);
	}
	public void count(int a) {
		int c=0;
	 while(a!=0) {
		 c++;
		 a=a/ 10;
	 }
			System.out.println(c);
		}
	
	}


