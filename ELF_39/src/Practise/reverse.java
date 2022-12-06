package Practise;
import java.util.Scanner;
public class reverse {
	public static void main(String[] args) {
		Scanner a1=new Scanner(System.in);
		System.out.println("Enter the number");
		int reversenumber=0;int num=a1.nextInt();
		int a=num;
		while(num!=0) {
			int reminder=num%10;
			reversenumber=(reversenumber*10)+reminder;
			num=num/10;
		}
		
		if(reversenumber==a) {
			System.out.println("palindrom number");
		}
		else {
		System.out.println("not palindrom number");
		}
		
	}

}
