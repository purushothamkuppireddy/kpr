package arraylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.List;

public class ArrayList1 {

	public static void main(String[] args) {
		//creating an arraylist;
		ArrayList ani =new ArrayList();
		ani.add("harry");
		ani.add(21);
		ani.add(10.1);
		ani.add("potter");
		
		Iterator i=ani.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		/*System.out.println(ani);
		System.out.println(ani.get(2));
		//insertint at particular index
		ani.add(2,"elephant");
		System.out.println(ani);*/
		
	}

}
