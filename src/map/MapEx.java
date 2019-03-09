package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx {

	public HashMap<String,Integer> disp(String name)
	{
		
		HashMap<String,Integer> map=new HashMap() ;
		map.put(name,name.length());
		return map;
		
		
	}
	
	public static void main(String[] args) {
		
		MapEx m=new MapEx();
		
		HashMap<String,Integer> m1=new HashMap() ;

		m1=m.disp("bob");
		//m1=m.disp("singh");
		for(Map.Entry me:m1.entrySet())
		{
			System.out.println(me.getKey()+"  "+me.getValue());
		}
	
		System.out.println(m1.keySet());
		System.out.println(m1.values());
		
		
		//Collection<Integer> value=m1.values();
		//Set<String> keys=m1.keySet();
		//System.out.println(keys+"  "+value);
	}

}
