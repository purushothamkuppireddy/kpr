package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class Hash {

	public static void main(String[] args) {
		
		HashSet<Integer> h=new HashSet<>();
		h.add(100);
		
		h.add(44);
		h.add(64);
		h.add(44);
			h.add(null);
		
		h.add(null);
		h.add(null);
	
		Iterator<Integer> i=h.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("done");
		
//		ListIterator<Integer> j=(ListIterator<Integer>) h.iterator();
//		while(j.hasNext())
//		{
//			System.out.println(j.next());
//		}
//		
		
		
		for(Integer k:h)
		{
			System.out.println(k);
		}
		
		
	}

}
