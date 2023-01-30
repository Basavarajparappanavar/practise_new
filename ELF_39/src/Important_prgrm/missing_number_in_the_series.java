package Important_prgrm;

public class missing_number_in_the_series {
public static void main(String[] args) {
	int num=12348;
	int num2=12348-10008;int sum2=0;
		int reminder_last=num%10;
		int reminder_first=num/10000;
		System.out.println(reminder_last);
		System.out.println(reminder_first);
		int sum1=reminder_first+reminder_last;
		System.out.println(sum1);
		
		for(int i=0;num2!=0;i++) {
			int reminder=num2%10;
			sum2+=reminder;
			num2/=10;
		}
		System.out.println(sum2);
		if(sum1==sum2) {
			System.out.println("xylem");
		}
		else {
			System.out.println("phylem"
					);
		}
	
}
}
