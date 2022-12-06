package Practise;
import java.util.Scanner;
public class A10 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the range");
		int range=sc.nextInt();
		int sum=0;
		for(int i=1;i<=range;i++) {
			if(prime(i)==true) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
		
	}
	public static boolean prime(int a) {
		if(a==1) {
			return false;
		}
		for(int i=2;i<=a/2;i++) {
			if(a%2==0) {
				return false;
			}
		}
		System.out.println(a); 
		return true;
		
	} 

}
