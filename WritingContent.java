package surendar;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WritingContent {
	public static void main(String[] args) throws IOException {
		File myFile=new File("C:\\Users\\srihojith\\Desktop\\shahid\\zealous.doc");
		
		FileOutputStream myStream=new FileOutputStream(myFile);
		
		// my logic
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the content to the file ");
		String myData=scan.nextLine();
		myStream.write(myData.getBytes());
		System.out.println(myFile.getName()+" has been written");
		
		myStream.close();
	}
}
