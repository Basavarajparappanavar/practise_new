package File_handling;
//to create the file
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class practise {
public static void main(String[] args) throws IOException {
	File f1=new File("demo.txt");
	if(!f1.exists()) {
		f1.createNewFile();
		System.out.println("file created successfully");
	}
	else {
		System.out.println("not created");
	}
	//to write the data inside the file
	FileOutputStream  f2=new FileOutputStream(f1);
	String args1="i am living in bengaluru";
	f2.write(args1.getBytes());
	f2.close();
	//to read the data from inside the file
	FileInputStream f3=new FileInputStream(f1);
	int i=f3.read();
	while(i!=-1) {
		System.out.print((char)i);
	i=f3.read();
}
	f3.close();
	
}
}
