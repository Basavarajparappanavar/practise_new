package Practise;
import java.util.*;

public class A6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the value");
		int a=sc.nextInt();
		raaj(a);
		sc.close();
		}
	public static void raaj(int a) {
		long c=1;
		for(int i=a;i>=1;i--) {
			c*=i;
		}
		System.out.println(c);
	}

}
