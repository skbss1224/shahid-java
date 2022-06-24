package surendar;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingContent {
	public static void main(String[] args) throws IOException {
		File myFile=new File("C:\\Users\\srihojith\\html basics\\cards.html");
		
		FileInputStream fis=new FileInputStream(myFile);
		
		byte[] tmp=new byte[fis.available()];
		fis.read(tmp);
		
		fis.close();
		
		String data=new String(tmp);
		
		System.out.println("REaded content from "+myFile.getName()+" is following");
		System.out.println(data);
	}
}
