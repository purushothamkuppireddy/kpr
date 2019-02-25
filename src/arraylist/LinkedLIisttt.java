
package arraylist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLIisttt {

	public static void main(String[] args) {
		
		
		LinkedList<String> ll=new LinkedList<>();
		
			ll.add("hhh");
			ll.add("sscds");
			ll.add("ds");
			//Collections.sort(ll);
			Iterator i=ll.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
			
		
	}

}
