package Stringclass;

public class product_of_2_array {
public static void main(String[] args) {
	int a[]= {1,2};
	int b[]= {6,3};
	int c[]= new int[a.length];
	for(int i=0;i<a.length;i++) {
		for(int j=b.length-1;j>=0;j--) {
			c[i]=a[i]*b[j];
			
			i++;
		}
		}
	//System.out.println(c.length);
	for(int i=0;i<c.length;i++) {
		System.out.println(c[i]);	
		}
}
}
