package Important_patterns_important_programs;

public class Removing_duplicates_of_anarray {
	
public static void main(String[] args) {
	
	int a[]= {1,1,2,2,2,3,5,8,9,10};
	int k=0;
	for(int i=0;i<a.length-1;i++) {
		if(a[i]!=a[i+1]) {
			a[k]=a[i];
			k++;
		}
	}
	a[k]=a[a.length-1];
	for(int i=0;i<=k;i++) {
		System.out.print(a[i]);
	}
	
}
}

