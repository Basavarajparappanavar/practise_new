package File_handling;
//new method to create file enter the data and retrieve

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filehandling2 {
public static void main(String[] args) throws IOException {
	File file=new File("newsample.txt");
	try {
		file.createNewFile();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	FileWriter fw=new FileWriter(file);
	fw.write("hey man");
	fw.close();
	Scanner sc=new Scanner(file);
	System.out.println(sc.nextLine());

			
}
}
