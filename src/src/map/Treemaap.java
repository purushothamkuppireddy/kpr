package map;

import java.util.TreeMap;
import java.util.Map;

public class Treemaap {

	public static void main(String[] args) {

		TreeMap<Integer,String> h=new TreeMap<>();
		h.put(101,"bob" );	
		h.put(105,"jj" );	

		h.put(108,"bk" );	
		//h.put(null,"bkk" );	
		h.put(null,"bkp" );	

		for(Map.Entry m:h.entrySet())
			{
				System.out.println(m.getKey()+"  "+m.getValue());
			
			}
			

		
		
		
	}

}
