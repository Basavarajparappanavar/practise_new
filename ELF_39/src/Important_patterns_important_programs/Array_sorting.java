package Important_patterns_important_programs;

public class Array_sorting {
public static void main(String[] args) {
	int a[]= {1,7,5,8,4,2};
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
		}
	}
	for(int i=0;i<a.length;i++) {
	System.out.println(a[i]);
	}
	System.out.println(a[0]);
	System.out.println(a[a.length-1]);
	
	
}
}
