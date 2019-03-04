

package arraylist;
import java.util.*;
import java.util.ArrayList;

public class Arraycheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList ani =new ArrayList();
		/*ani.add("harry");
		ani.add(21);
		ani.add(10.1);
		ani.add("potter");
		System.out.println("enetr");
		//int x=sc.nextInt();*/
		
		System.out.println("enter");
		for(int i=0;i<6;i++)
	{
	 String a=sc.next();
		ani.add(a);
	}
	System.out.println(ani);	
		
System.out.println("search for");
		String x=sc.next();
		System.out.println(ani.contains(x));
		}

}

