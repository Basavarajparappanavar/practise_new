package Important_patterns_important_programs;

public class Armstrong {
public static void main(String[] args) {
	int num=153,b=num,temp=num,count=0;
	for(int i=0;num!=0;i++) {
		count++;
		num/=10;
	}
	int sum=0;
	for(int j=0;b!=0;j++) {
		int reminder=b%10;
		sum=sum+(int)Math.pow(reminder, count);
		System.out.println(sum);
		b/=10;
	}
	System.out.println(count);
	System.out.println(sum);
	
	if(temp==sum) {
		System.out.println("Armstong");
	}
	else {
		System.out.println("not");
	}
	

}
}
