package Practise;

public class adding_elements_of_2_arrays {
public static void main(String[] args) {
	int a[]= {1,2,3};
	int b[]= {4,5,6};int k=0;
	int c[]=new int[a.length+b.length];
	for(int i=0;i<a.length+b.length;i++) {
		if(i<a.length) {
			c[i]=a[i];
		}
		else {
			c[i]=b[k];
			k++;
		}
	}
	
	
	for(int i=0;i<c.length;i++) {
		System.out.println(c[i]);
	}
}
}
