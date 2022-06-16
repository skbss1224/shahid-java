package surendar;
class Bass implements Runnable{

	synchronized public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {}
		}
	}
	
}
class mani extends Thread{

	public void run() {
		// TODO Auto-generated method stub
		
			
			for(int i=0;i<=5;i++) {
				System.out.println("hello im sasi");
			try {
					Thread.sleep(2000);
				}
				catch(InterruptedException e) {}
			}
		
	}
	
}

public class find {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		Runnable book=new Bass();
		//book.start();
		Thread t1=new Thread(book);
		t1.start();
		mani ji=new mani();
		ji.start();
		ji.setName("dinesh");
		System.out.println(ji.getName());
		ji.join();
		
		System.out.println("bye");
		
	}

}
