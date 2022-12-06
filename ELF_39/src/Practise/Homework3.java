package Practise;

public class Homework3 {
	

	static int a=10; int b=20;
	public static void main(String[] args) {
		Homework3 a1=new Homework3();
	a1.b=a;
	Homework3 a2=new Homework3();
	a=a2.b;
	
		System.out.print(a+" "+a1.b);
	}

}
