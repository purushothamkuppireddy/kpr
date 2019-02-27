package threads;

public class Threaddemo extends Thread {

	
	public void run()
	{
		System.out.println("Thread called");
	}
	
	public static void main(String[] args) {
		
	Threaddemo th=new Threaddemo();
	th.start();    // implicitly calling run method
	
	
	
	//th.run();// also can be called directly
	
	}

}
