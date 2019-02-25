package arraylist;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedLisitime {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		ArrayList<Integer> al=new ArrayList<>();
		
	for(int i=0;i<10e5;i++)
	{
		ll.add(i);
		
	}
	System.out.println("progrs....");
	long start=System.currentTimeMillis();
	
	for(int i=0;i<10e5;i++)
	{
		
		ll.add(i);
		
	}
	long end=System.currentTimeMillis();
	
	System.out.println("time :"+(end-start));
	
	
	
	
	
	for(int i=0;i<10e6;i++)
	{
		al.add(i);
		
	}
	System.out.println("progrs....");
	long start2=System.currentTimeMillis();
	
	for(int i=0;i<10e5;i++)
	{
		al.add(i);
		
	}
	long end2=System.currentTimeMillis();
	
	System.out.println("time :"+(end2-start2));
	
	
	
		
	}

}
