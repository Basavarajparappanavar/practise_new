package Practise;
import java.util.Scanner;
import java.io.*;
public class A12 {
	static Scanner a1=new Scanner(System.in);
	public static final String TEXT_RESET = "\u001B[0m";
	public static void main(String[] args) {
		System.out.println("Enter the size of an array");
		int b=a1.nextInt();
		int a[]=new int[b];
		System.out.println("Give the input values for an array before sorting");
		for(int i=0;i<a.length;i++) {
			a[i]=a1.nextInt();
		}
		for(int j=0;j<a.length;j++) {
			for(int k=j+1;k<a.length;k++) {
				if(a[j]>a[k]) {
					int temp=a[j];
					a[j]=a[k];
					a[k]=temp;
				}
			}
		}
		System.out.println("output after sorting");
		for(int l=0;l<a.length;l++) {
			System.out.println(a[l]);
		}
	}

}
