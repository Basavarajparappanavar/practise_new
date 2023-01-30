package Exceptionalhandeling;

public class exception_try {
public static void main(String[] args) {
	try {
	System.out.println(30/0);
	}
	catch(ArithmeticException e) {
		System.out.println("handled");
	}
}
}
