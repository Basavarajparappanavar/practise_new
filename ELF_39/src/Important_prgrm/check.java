package Important_prgrm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class check {
	public static void main(String[]args) {
	int a[]= {1,2,3,6,7,8,9};
	int num=0;int j=0;
	List l=new ArrayList<>();
	for(int i=a[0];i<a[a.length-1];i++) {
		if(i==a[j++]) {
			continue;
		}
		else {
			num=i;
		
			l.add(i);
		}
	}
	System.out.println(l);	
	System.out.println(num);
	}
}
