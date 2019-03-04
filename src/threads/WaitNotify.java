package threads;

class Customer {
	int amount = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw...");

		if (this.amount < amount) {
			System.out.println("Less balance; waiting for deposit...");
			try {
				wait();
			} catch (Exception e) {
			}
		}
		
		this.amount -= amount;
		System.out.println("withdraw completed...remaining bal: "+this.amount);
		
		System.out.println("Thank you");
	//System.out.println("remaining amt: "+this.amount);
	}

	
	
	synchronized void deposit(int amount) {
		System.out.println("going to deposit...");
	
		this.amount += amount;
		System.out.println("deposit completed...after deposit: "+this.amount);
		
		notify();
		notifyAll();
	}
}

class WaitNotify {
	public static void main(String args[]) {
		Customer c = new Customer();
	
		//thread1
		Thread th1=new Thread(new Runnable() 
		{
			public void run() 
			{
				c.withdraw(30000);
			}
		});
		th1.start();
		
		
		//thread2
		Thread th2=new Thread(new Runnable() {
			
		
			public void run() {
				c.withdraw(40000);
			}
		});
		th2.start();
		
		
		//thread3
		Thread th3=new Thread(new Runnable() {
			public void run() {
		
				c.deposit(10000);
				
				
				
			}
		});
		th3.start();

	}
}

