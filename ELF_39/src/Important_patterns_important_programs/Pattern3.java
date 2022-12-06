package Important_patterns_important_programs;

public class Pattern3 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		for(int j=i;j<=4;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
