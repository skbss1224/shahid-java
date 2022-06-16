package surendar;

class Book implements Runnable{
	

	public  void run() {
		// TODO Auto-generated method stub
		for (int i=1;i<=5;i++) {
			System.out.println("update");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {}
		}
	}
}
class Num{
	synchronized public static void print() {
		// TODO Auto-generated method stub
		for (int i=1;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {}
		}
		}
	}
	


public class hi {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Runnable book=new Book();
		Num num=new Num();
		Thread t1=new Thread(book);
		t1.start();
		//Book.update();
		t1.setName("book1");
		System.out.println(t1.getName());
		//run
		Num.print();
		
		System.out.println("bye");
	}

}
