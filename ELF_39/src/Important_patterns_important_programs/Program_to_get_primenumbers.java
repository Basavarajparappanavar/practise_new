package Important_patterns_important_programs;

import java.util.Scanner;

public class Program_to_get_primenumbers {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the value");
	int start=sc.nextInt();int end=sc.nextInt();
for(int num=start;num<=end;num++) {
	boolean v=true;
	for(int i=2;i<num;i++) {
		if(num%i==0) {
			v=false;
		}
	}
	if(v==true) {
		System.out.println(num+"prime");
	}
//	else {
//		System.out.println(num+"not a prime");
//	}
}
}
}

