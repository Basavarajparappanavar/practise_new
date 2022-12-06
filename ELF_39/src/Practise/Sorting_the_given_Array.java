package Practise;

public class Sorting_the_given_Array {
public static void main(String[] args) {
	int a[]= {2,1,4,6,9,5};
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
		if(a[i]>a[j]) {
			int b=a[i];
			a[i]=a[j];
			a[j]=b;
			
			
		}
	}
}
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
}
}
