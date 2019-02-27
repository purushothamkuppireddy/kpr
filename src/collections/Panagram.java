package collections;

import java.util.TreeSet;
import java.util.Iterator;

public class Panagram {

	public static void main(String[] args) {
		String s1="We promptly judged antique ivory buckles for the next prize";
		//String s1="the quick brown fox jumps over the lazy dog";
		char[] ch1=s1.toCharArray();
		TreeSet h=new TreeSet();
		for (int i = 0; i < ch1.length; i++)
			
		{
			h.add(ch1[i]);
		}
		Iterator i=h.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("done");
	System.out.println(h.size());
	//System.out.println((int)ch1[3]);
		if(h.size()==27)
		{
			System.out.println("yes Panagram");
		}
		else
		{
			System.out.println("no");
		}
		
		
		
		
	}

	

}
