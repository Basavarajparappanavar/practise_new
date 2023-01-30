package Important_prgrm;

import java.util.Scanner;

public class Strong_number_check {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int actual=num;int given=num;
	int sum=0;
	for(int i=0;num!=0;i++) {
		int reminder=num%10;
		int fact=1;
		for(int j=reminder;j>=1;j--) {
			fact*=j;
			
		}
		sum+=fact;
		num/=10;
	}
	if(sum==actual) {
	System.out.println("Strong number");
}
	else {
		System.out.println("not strong number");
	}
}
}
