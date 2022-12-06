package Important_patterns_important_programs;

public class Fabonci_series {
public static void main(String[] args) {
	int n=9;
	int a=0,b=1,sum=0;
	for(int i=0;i<n;i++) {
		if(i==0||i==1) {
			System.out.print(i);
		}
		else {
			sum=a+b;
			System.out.print(sum);
			a=b;
			b=sum;
		}
	}
}
}
