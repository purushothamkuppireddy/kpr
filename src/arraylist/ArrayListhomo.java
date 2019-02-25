package arraylist;
import java.util.ArrayList;

public class ArrayListhomo {

	public static void main(String[] args) {
	
		ArrayList<Integer> al1 =new ArrayList<>();
		
		al1.add(10);
		al1.add(33);
		ArrayList<Integer> al =new ArrayList<>();
		al.add(12);
		al.add(55);
		al.addAll(al1);
		System.out.println(al);
		System.out.println(al.get(2));
		
	}

}
