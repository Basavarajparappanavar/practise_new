package File_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//to create the folder in drive and store the data and to read the data//
public class practise2 {
public static void main(String[] args) throws IOException {
	File f1=new File("C://workspace/sampleone");
	if(!f1.exists()) {
		f1.createNewFile();
		System.out.print("file got successfully created");
	}
	else {
		System.out.println("not created");
	}
	FileOutputStream f2=new FileOutputStream(f1);
	String i="hello Everyone";
	f2.write(i.getBytes());
	FileInputStream f3=new FileInputStream(f1);
	int j=f3.read();
	while(j!=-1) {
		System.out.print((char)j);
	j=f3.read();
}
}
}
