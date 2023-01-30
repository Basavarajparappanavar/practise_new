package Important_prgrm;

import java.util.Scanner;

public class to_throw_exception {
public static void main(String[] args) {
	Scanner sdc=new Scanner(System.in);
	System.out.println("enter the number");
	int a=sdc.nextInt();
	try {
	if(a==0) {
		throw new Basavaraj_exception();
	}
	else {
		System.out.println(a);
	}
	}catch(Basavaraj_exception e) {
		e.printStackTrace();
	}
	System.out.println("hi");
}
}
