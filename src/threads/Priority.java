package threads;

public class Priority extends Thread {
 
	public void run()
	{
		///System.out.println("Thread called");
		
		//System.out.println("Thread name is:"+Thread.currentThread().getName());
		
		System.out.println("Thread priority of "+ Thread.currentThread().getName()+":  "+Thread.currentThread().getPriority());
	
	}
	
	public static void main(String[] args) {
		
		Priority t1=new Priority();
		
		Priority t2=new Priority();
		
		Priority t3=new Priority();
	
		
		
	t1.setPriority(MIN_PRIORITY);
	t1.start();
	
	t2.setPriority(NORM_PRIORITY);
	t2.start();
	t3.setPriority(MAX_PRIORITY);
	t3.start();
	
	
	
	}

}
