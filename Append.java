package surendar;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Append {
	public static void main(String[] args) throws IOException {
		File myFile=new File("C:\\Users\\srihojith\\Desktop\\shahid\\zealous.doc");
		
		FileInputStream fis=new FileInputStream(myFile);
		
		byte[] tmp=new byte[fis.available()];
		fis.read(tmp);
		
		fis.close();
		
		String old=new String(tmp);// old data in the file
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the content to the file ");
		String newData=scan.nextLine();// user required new content to be added in the file
		
		String currentData=old+newData;//old.concat(newData);
		
		FileOutputStream myStream=new FileOutputStream(myFile);
		
		myStream.write(currentData.getBytes());
		System.out.println(myFile.getName()+" has been appended");
		
		myStream.close();
	}
}
