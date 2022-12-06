package Important_patterns_important_programs;

public class pattern6_second_solution {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		int a=1;char b='A';
		for(int j=1;j<i;j++) {
			System.out.print(a++);
		}
		for(int k=i;k<=5;k++) {
			if(i==k) {
				System.out.print("@");
			}
			else {
				System.out.print(b++);
			}
		}
		System.out.println();
	}
}
}
