package Important_prgrm;

import java.util.Scanner;

public class remove_duplicate_from_array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int a[]=new int[sc.nextInt()];int k=0;
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
			a[k]=a[i];
			k++;
		}
	}
		a[k]=a[a.length-1];
		for(int i=0;i<=k;i++) {
			System.out.println(a[i]);
		}
	}
}
