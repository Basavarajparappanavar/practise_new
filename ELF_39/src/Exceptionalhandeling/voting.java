package Exceptionalhandeling;

import java.util.Scanner;

public class voting {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the age");
	int age=sc.nextInt();
	try {
	if(age<18) {
		throw new throw_exception("not eligible");
	
		
	}
	else {
		System.out.println("eligible");
	}
	}catch(throw_exception e) {
		e.printStackTrace();
	}
	System.out.println("hi");
	
}
}
