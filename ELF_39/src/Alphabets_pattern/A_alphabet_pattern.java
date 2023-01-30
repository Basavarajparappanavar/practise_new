package Alphabets_pattern;

public class A_alphabet_pattern {
public static void main(String[] args) {
	int n=11;
	 String ANSI_YELLOW = "\u001B[39m";
	for(int row=1;row<=n;row++) {
		for(int col=1;col<=n;col++) {
			if(row==1&&col==n/2+1) {
				System.out.print( ANSI_YELLOW+"*");
			}
			else if(row==2&&(col==2||col==n-1)) {
				System.out.print( ANSI_YELLOW+"*");
			}
			else if(row==n/2+1&&(col!=1||col!=n)) {
				System.out.print( ANSI_YELLOW+"*");
			}
			else if(row==n&&(col==1||col==n)) {
				System.out.print( ANSI_YELLOW+"*");
			}
			else if(row>n/2&&(col==1||col==n)) {
				System.out.print( ANSI_YELLOW+"*");
			}
			else {
				System.out.print( ANSI_YELLOW+" ");
			}
		}
		System.out.println();
	}
}
}
