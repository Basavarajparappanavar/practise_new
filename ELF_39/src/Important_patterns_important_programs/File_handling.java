package Important_patterns_important_programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_handling {
public static void main(String[] args) throws IOException {
	File fl=new File("demos.txt");
	if(!fl.exists()) {
		fl.createNewFile();
		System.out.println("file created");
	}
	else {
		System.out.println("not created");
	}
	FileOutputStream fos=new FileOutputStream(fl);
	String s="basavaraj";
	fos.write(s.getBytes());
	fos.close();
 
	FileInputStream fis=new FileInputStream(fl);
	int i=fis.read();
	while(i!=-1) {
		System.out.print((char)i);
		i=fis.read();
	}
}
}
