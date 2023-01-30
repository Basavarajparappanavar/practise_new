package Alphabets_pattern;

public class Y_alpha {
public static void main(String[] args) {
	int n=5;
	for(int row=1;row<=5;row++) {
		for(int column=1;column<=5;column++) {
			if((row==column&&row<=n/2+1)||(column==n-row+1)) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
