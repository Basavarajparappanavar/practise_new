package Exceptionalhandeling;

import javax.management.RuntimeErrorException;

public class Example1 extends RuntimeException {
		Example1(String str){
			super(str);
		         }
		                    	
		           public static void main(String[] args) {
					int age=17 ;
					if(age>=18) {
						System.out.print("eligible vote");
				}         
					else {
						throw new Example1("not eligible");
					}
		                   
	}
	}


