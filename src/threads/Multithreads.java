package threads;

 
	class Thread1 extends Thread {
		
		public void run()
		{
			for (int i = 0; i < 10; i++) {
				
			
			System.out.println("Thread1 called");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			}
		}
			
}
	
class Thread2 extends Thread {
		
	public void run()
	{
		for (int i = 0; i < 10; i++) {
			
		
		System.out.println("Thread2 called");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}
	
	
	}

	
public class Multithreads {

	
	public static void main(String[] args) {
		Thread1 th1=new Thread1();
		Thread2 th2=new Thread2();
		th1.start();
		th2.start();
	}

}
