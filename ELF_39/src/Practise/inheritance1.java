package Practise;

public class inheritance1 extends inheritance {
	static int b=20;
	int  add() {
		System.out.println("add method");
		int a=30,b=30;
		int c=a+b;
		return c;
	}
	public static void main(String[] args) {
		System.out.println(inheritance.b);
		System.out.println(b);
		inheritance1 a1=new inheritance1();
		System.out.println(a1.add());
		inheritance a2=new inheritance();
		System.out.println(a2.add());
		
		
	}

}
