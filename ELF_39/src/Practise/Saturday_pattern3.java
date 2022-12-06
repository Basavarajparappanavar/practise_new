package Practise;

public class Saturday_pattern3 {
	public static void main(String[] args) {
		char d='A';int e=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==j) {
					System.out.print(" "+"@");
				}
				else if(i<j) {
					System.out.print(" "+d++);
				}
				else {
					System.out.print(" "+e++);
				}
					
				}
			System.out.println();
	}
}
}
