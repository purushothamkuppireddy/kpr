package threads;

public class Threadrunable implements Runnable  {
	
public void run()
{
	System.out.println("THread called");
}
	
	public static void main(String[] args) {
		
		Threadrunable th=new Threadrunable();
		Thread thread= new Thread(th);
		thread.start();
		
	}
	
	//second way to declare thread by direct instance of runnable
	
	/*public class Threadrunable  {
public static void main(String[] args) {
			
			
			Thread thread= new Thread(new Runnable() {
				public void run()
				{
					System.out.println("THread1 called");
				}
		
				
			});thread.start();
			
		}*/
	
	
	
	
	//third way to  declare a thread using lambda expression

	/*public class Threadrunable  {
	public static void main(String[] args) {
	Thread mythread= new Thread(()->System.out.println("Thread is called"));
	mythread.start();
		
	}*/
	
	
		
		
	}	
	


