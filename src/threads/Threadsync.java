package threads;

 class Count {

	Count c;
	
	synchronized void  printTable(int n)
	{
		for (int i = 1; i <=10; i++)
		{
		System.out.println(n+" *"+i+" ="+(n*i));
		
		}
	}
}
	class TA extends Thread
	{
		Count c;
		TA(Count c)
		{
		this.c=c;
		}
	
	
		public void run()
		{
			c.printTable(2);
		}
	}
	
	class TB extends Thread
	{
		Count c;
		TB(Count c)
		{
		this.c=c;
		}
	
	
		public void run()
		{
		c.printTable(7);
		}
	}

	
	
 public class Threadsync{
	
	public static void main(String[] args) {
		Count c=new Count();
		TA ta=new TA(c);
		TB tb=new TB(c);
		ta.start();
		tb.start();
		
	
	}

}

