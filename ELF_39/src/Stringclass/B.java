package Stringclass;

public class B extends A {
static int b=20;
public void a() {
	System.out.println("hellooo");
}
public static void main(String[] args) {
	A c=new B();
	B d=(B)c;
	d.a();

	System.out.println(d.b);
}
}
