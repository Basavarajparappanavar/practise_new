package Stringclass;

import java.util.Scanner;

public class adding_numbers_from_string {
public static void main(String[] args) {
	      String str;
	      char ch;
	      Scanner s = new Scanner(System.in);
	      int sum=0;
	      
	      System.out.print("Enter the String: ");
	      str = s.nextLine();
	      
	      System.out.println("\nNumbers available in the String are:");
	      for(int i=0; i<str.length(); i++)
	      {
	         ch = str.charAt(i);
	         if(Character.isAlphabetic(ch))
	        	 System.out.println(ch);
	            
	      }
	      System.out.println(sum);
	   }
}
