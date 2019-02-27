package map;

import java.util.HashMap;
import java.util.Map;

public class Hashmaap {
public static void main(String [] args)
{
	HashMap<Integer,String> h=new HashMap<>();
h.put(101,"bob" );	
h.put(105,"jj" );	

h.put(108,"bk" );	


h.put(null,"bkk" );	
h.put(null,null );	

for(Map.Entry m:h.entrySet())
	{
		System.out.println(m.getKey()+"  "+m.getValue());
	
	}
	
}
}
