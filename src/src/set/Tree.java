package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Tree {

	public static void main(String[] args) {
		
		
		TreeSet<Integer> h=new TreeSet<>();
		
		h.add(44);
		h.add(54);
		
		h.add(64);
		h.add(44);
		
		h.add(9);
		h.add(80);
		h.add(77);
		
		
		
//		h.add(null);
		//h.add(null);
	
		Iterator i=h.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	
		
		
	}

}
