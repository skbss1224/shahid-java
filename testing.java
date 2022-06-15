package surendar;

import java.util.Scanner;
  
public class testing implements Runnable {
    
    public void run()
    {
        for (int i = 0; i < 4; i++) {
            System.out.println( "  "+ i);
            try {
                
                Thread.sleep(1000);
            }
  
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }
  
    public static void main(String[] args) throws Exception
    {
        Thread t = new Thread(new testing());
        t.start();
  
        Thread t2 = new Thread(new testing());
        // call run() function
        t2.start();
    }
}