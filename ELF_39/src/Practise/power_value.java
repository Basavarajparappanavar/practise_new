package Practise;
import java.util.Scanner;
public class power_value {
public static void main(String[] args) {
	Scanner a1=new Scanner(System.in);
	System.out.println("Enter the range");
	int start=a1.nextInt();int end=a1.nextInt();
	int b=2;
	for(int i=start;i<=end;i++) {
	System.out.println((int)Math.pow(i, b));
	}
}
}
