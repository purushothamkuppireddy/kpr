package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmaap {
public static void main(String [] args)
{
	HashMap<Integer,String> h=new HashMap<>();
h.put(101,"bob" );	
h.put(105,"jj" );	
h.put(105,"jh");
h.replace(101,"raju"); 
h.remove(105,"jh");//"value" is optional,if we don't use also it removes  both 105 key,similar to h.remove(105)
h.put(null,"bob" );	
h.put(null,null);	

h.putIfAbsent(105,"jk");//105 should not be there in the map, then only it will execute
for(Map.Entry m:h.entrySet())
	{
		System.out.println(m.getKey()+"  "+m.getValue());
	
	}

//can also..get by
/*Set s1=h.keySet();
Iterator<Integer> i=s1.iterator();
while(i.hasNext())
{
	Integer I1=(Integer)i.next();
	
	System.out.println(I1
			+" "+ h.get(I1));
}*/


	System.out.println(h);
	System.out.println(h.keySet());
	System.out.println(h.values());
	
	
}
}
