package surendar;

import java.io.File;
import java.io.IOException;

public class filefolderdemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		File file=new File("C:\\Users\\srihojith\\desktop\\shahid");
//		boolean present=file.exists();
//		System.out.println("folder present:"+present);
//			if(present==false)
//				file.mkdir();
//			present=file.exists();
//			System.out.println("folder present:"+present);
		//text file created
		File file=new File("C:\\Users\\srihojith\\desktop\\shahid\\test.txt");
//		boolean present=file.exists();
//		if(present==false)
//			try {
//				boolean created=file.createNewFile();
//				System.out.println("file created"+created);
//			}
//			catch(IOException e) {
//				e.printStackTrace();
//			}
//		file.delete();
//		boolean present=file.exists();
//		System.out.println("file preasent"+present);
		
		file.createNewFile();
		File newName=new File("C:\\Users\\srihojith\\Desktop\\shahid\\hello.txt");
		boolean renamesuccess=file.renameTo(newName);
		System.out.println("rename success"+renamesuccess);
	}

}
