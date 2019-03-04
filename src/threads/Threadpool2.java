package threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
class Task2 implements Runnable {
	public void run()
	{
		System.out.println("Thread name: "+ Thread.currentThread().getName());
		
	}
}


public class Threadpool2 {
	

	//private static final TimeUnit SECONDS = null;

	public static void main(String[] args)
	{
	ScheduledExecutorService service=Executors.newScheduledThreadPool(3);
	
	
	//service.schedule(new Task(),10,TimeUnit.SECONDS);//task to run after 10 seconds
	
	
	service.scheduleAtFixedRate(new Task2(),5,8, TimeUnit.SECONDS );  //task to run repeatedly every 10 seconds
	
	
		//task to run repeatedly 10 seconds after previous task completes
			//service.scheduleWithFixedDelay(new Task(),5,8, TimeUnit.SECONDS);
	
}
}
