package surendar;

import java.io.File;

public class filefolderdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\srihojith\\desktop\\shahid");
		boolean present=file.exists();
		System.out.println("folder present:"+present);
			if(present==false)
				file.mkdir();
			present=file.exists();
			System.out.println("folder present:"+present);
		
		
	}

}
