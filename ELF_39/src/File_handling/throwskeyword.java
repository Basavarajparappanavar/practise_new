package File_handling;
//THROWS KEYWORD IS USED TO PROMOT THE EXCEPTION IN THE CALLER METHOD SO THAT CALLER METHOD IS RESPONSIBLE FOR HANDLING THE EXCEPTION
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;

public class throwskeyword {
static void m() throws IOException  {
	FileOutputStream a1=new FileOutputStream("C://workspace/sample.txt");
	String s="heelloo";
	a1.write(s.getBytes());
}
public static void main(String[] args) throws IOException {
	m();
}
}

