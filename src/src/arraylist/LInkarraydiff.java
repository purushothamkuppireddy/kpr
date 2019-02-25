package arraylist;

import java.util.ArrayList;
import java.util.LinkedList;

public class LInkarraydiff {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		ArrayList<Integer> al=new ArrayList<>();
		
		
	ll.add(0,19);
	ll.add(1,55);
	long start=System.currentTimeMillis();

	for(int i=0;i<10e5;i++)
	{
		ll.add(2,i);
		
	}
	
	
	System.out.println("progrs....");
long end=System.currentTimeMillis();
	
	System.out.println("time :"+(end-start));
	
	
	
	
	al.add(0,19);
	al.add(1,55);
	long start2=System.currentTimeMillis();

	for(int i=0;i<10e5;i++)
	{
		al.add(2,i);
		
	}
	System.out.println("progrs....");
long end2=System.currentTimeMillis();
	
	System.out.println("time :"+(end2-start2
		
			));
	

	
	
	
	
	}

}
