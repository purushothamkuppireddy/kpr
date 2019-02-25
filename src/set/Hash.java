package set;

import java.util.HashSet;
import java.util.Iterator;

public class Hash {

	public static void main(String[] args) {
		
		HashSet<Integer> h=new HashSet<>();
		
		h.add(44);
		h.add(64);
		h.add(44
				);
			h.add(null);
		
		h.add(null);
		h.add(null);
	
		Iterator i=h.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("done");
	
		
//		for(Integer k:h)
//		{
//			System.out.println(k);
//		}
//		
//		
	}

}
