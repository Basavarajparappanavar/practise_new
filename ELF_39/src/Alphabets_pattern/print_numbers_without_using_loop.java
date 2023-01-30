package Alphabets_pattern;

public class print_numbers_without_using_loop {
public static void main(String[] args) {
	num(1);
}
public static void num(long i) {
	if(i<100000) {
		System.out.println(i);
		num(i+1);
		
	}
}
}
