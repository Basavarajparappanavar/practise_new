package Exceptionalhandeling;

import java.util.Scanner;

public class youngerageexception extends RuntimeException {
	youngerageexception(String str){
		super(str);
	         }
	                    	
	
	           public static void main(String[] args) {
	        	   Scanner a1=new Scanner(System.in);
	        	   System.out.println("enter the age");
				int age=a1.nextInt();
				if(age>=18) {
					System.out.println("eligible for voting");
			}         
				else {
					throw new youngerageexception("not eligible");
				}
	                   

}
}
