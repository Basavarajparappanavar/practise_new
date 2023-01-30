package Stringclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class replacemethod {
	public static void main(String[] args) {
		int a[][]=new int [4][4];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=i;
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		
	}
	}

}
