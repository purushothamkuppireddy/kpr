package threads;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashmapEx extends Thread {

	static ConcurrentHashMap m= new ConcurrentHashMap();
	public void run()
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" Child thread updating map ");
		m.put(103,"C");
	
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
	m.put(101,"A");
	m.put(102,"B");
	m.put(104,"D");
	ConcurrentHashmapEx th= new ConcurrentHashmapEx();
	th.start();
	
	Set s=m.keySet();
	Iterator itr=s.iterator();
	while(itr.hasNext())
	{
		
		Integer I1=(Integer)itr.next();
		System.out.println("Main Thread Iterating map and current entry is: "+I1 +"..."+m.get(I1));
		
		Thread.sleep(2000);
		
	}
	
	System.out.println(m);
	}

}
