package Practise;

public class Constructor_calling_with_non_static_block {
	Constructor_calling_with_non_static_block(){
		System.out.println("CONSTRUCTOR WITH ZERO PARAMETER");
	}
	Constructor_calling_with_non_static_block(int a,int b){
		System.out.println("CONSTRUSTOR WITH TWO PARAMETERS");
	}
	{
		System.out.println("NON STATIC BLOCK 1");
	}
	{
		System.out.println("NON STATIC BLOCK 2");
	}
	static {
		System.out.println("STATIC BLOCK 1");
	}
	static {
		System.out.println("STATIC BLOCK 2");
	}
	void Constructor_calling_with_non_static_block() {
		System.out.println("METHOD 1");
	}
	

}
