package Important_prgrm;

import java.util.Scanner;

public class print_num_and_get_exception {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		try {
			Basavaraj_exception b=new Basavaraj_exception();
			String i=b.getnumber(0);
			System.out.println(i);
		}catch(Basavaraj_exception e) {
			System.out.println("number is zero"+e);
		e.printStackTrace();
		}
		System.out.println("hi");
	}
}
