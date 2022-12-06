package Important_patterns_important_programs;

public class pattern6 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		int a=1;char b='A';
		for(int j=1;j<=5;j++) {
			if(i==j) {
				System.out.print("@");
			}
			else if(i<j) {
				System.out.print(b++);
			}
			else {
				System.out.print(a++);
			}
		}
		System.out.println();
	}
}
}
