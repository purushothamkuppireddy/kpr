package threads;

public class Threadrunable implements Runnable {

	
public void run()
{
	System.out.println("THread called");
}
	
	public static void main(String[] args) {
		
		Threadrunable th=new Threadrunable();
		Thread thread= new Thread(th);
		thread.start();
		
		
		
		
		
	}

}
