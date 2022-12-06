package Practise;
import java.util.*;
public class A8 {
public static void main(String[] args) {
	Scanner a1=new Scanner (System.in);
	System.out.println("Enter the value");
	int b = a1.nextInt();
	A8 r1=new A8();
	r1.fact(b);
	
}
void fact(int b) {
	int c=1;
	for(int i=1;i<=b;i++) {
		c*=i;
	}
System.out.println("Factorial of the given value is");
	System.out.println(c);
}
}

