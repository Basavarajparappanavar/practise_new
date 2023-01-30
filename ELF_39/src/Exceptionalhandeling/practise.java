package Exceptionalhandeling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class practise {
public static void main(String[] args) {
	try {
	//FileInputStream fis=new FileInputStream("demo.txt");
		Class.forName("hi");
	}catch(ClassNotFoundException e) {
		System.out.println("not found");
	}
}
}
