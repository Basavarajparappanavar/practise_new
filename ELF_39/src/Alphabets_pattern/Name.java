package Alphabets_pattern;
import java.io.*;

public class Name {
	public static final String ANSI_YELLOW = "\u001B[43m";
public static void main(String[] args) {
	int n=5;
	for(int row=0;row<n;row++) {
		for(int column=0;column<n;column++) {
			if((row==2&&column==4)||(row==0&&column==4)||(row==4&&column==4)) {
				System.out.print(" ");
			}
			else if(column==0||row==0||row==4||column==4||row==2) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	System.out.println();
	for(int row=0;row<n;row++) {
		for(int column=0;column<n;column++) {
			if((row==0&&column==0)||(row==0&&column==4)) {
				System.out.print(" ");
			}
		else if(column==0||row==0||column==4||row==2) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
		
	}
	System.out.println();
	for(int row=0;row<n;row++) {
		for(int column=0;column<n;column++) {
			if(row==0||row==2||row==4) {
				System.out.print("*");
			}
			else if((row==1&&column==0)||(row==3&&column==4)){
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	System.out.println();
	for(int row=0;row<n;row++) {
		for(int column=0;column<n;column++) {
			if(row==0||row==2||row==4) {
				System.out.print("*");
			}
			else if((row==1&&column==0)||(row==3&&column==4)){
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	System.out.println();
	for(int row=0;row<n;row++) {
		for(int column=0;column<n;column++) {
			if(column==0||column==4||row==4) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	
	}
		
}
}
