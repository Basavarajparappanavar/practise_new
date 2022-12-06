package Practise;

public class A7 {
	public static void main(String[] args) {
		int num=559;
		boolean flag=true;
		for(int i=2;i<num/2;i++) {
			if (num%i==0) {
				flag=false;
				break;
			}
	}
	if(flag==false) {
		System.out.println("prime number");
	}
	else {
		System.out.println("composite number");
	}
	}
	

}
