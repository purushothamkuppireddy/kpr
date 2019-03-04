package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threadpool1  {

	public static void main(String[] args) 
	{
		
		int count=Runtime.getRuntime().availableProcessors();
		System.out.println(count);
		//create the fixedpool
		ExecutorService service=Executors.newFixedThreadPool(count);
		
		//create the cachedpoll
		//ExecutorService service=Executors.newCachedThreadPool();  
		
		//submit the task for execution
		for (int i = 0; i < 10; i++)
		{
			service.execute( new Task());
		//	System.out.println("Thread name: "+ Thread.currentThread().getName());
				
			
		}	
	}
}
 class Task implements Runnable {
		public void run()
		{
			System.out.println("Thread name: "+ Thread.currentThread().getName());
			
		}
	}
	
	
