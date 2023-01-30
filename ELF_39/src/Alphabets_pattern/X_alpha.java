package Alphabets_pattern;

public class X_alpha {
public static void main(String[] args) {
		int n=5;
		for(int row=1;row<=n;row++){
		for(int column=1;column<=n;column++){
		if((column==1||(row<3&&column==n-row+1))||(row==3&&column==2)){
		System.out.print("*");
		}
		else if(row>3&&row==column) {
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
