package surendar;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteAsObject 
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("C:\\Users\\srihojith\\Desktop\\shahid\\zealous.doc");
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		Account account1=new Account("sasi", 87654345678L, 2300.90);
		oos.writeObject(account1);
		
		oos.close();
		fos.close();
		
		System.out.println(account1+" has written in a file "+file.getName());
	}
}
