package Practise;
import java.util.Scanner;
public class Homework4 {
	public static void main(String[] args) {
		
		Scanner a1=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int b =a1.nextInt();
		int a[]=new int[b];
		System.out.println("enter input values");
		for(int i=0;i<a.length;i++) {
			a[i]=a1.nextInt();
		}
		for(int j=0;j<a.length;j++) {
			for(int k=0+j;k<a.length;k++) {
				if(a[j]<a[k]) {
					int temp=a[j];
					a[j]=a[k];
					a[k]=temp;
				}
			}
		}
		System.out.println("output after sorting");
		for(int m=0;m<a.length;m++) {
			System.out.println(a[m]);
		}
	}

}
