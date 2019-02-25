package wrapperEx;

import java.util.ArrayList;
import java.util.Collections;

public class Sortstudents {

	public static void main(String[] args) {
		
		ArrayList<Student1> al=new ArrayList<>();
		al.add(new Student1(1,"viki",28));
		al.add(new Student1(3,"sri",27));		
	
	Collections.sort(al);
	for(Student1 st:al)
	System.out.println(st.roll+"  "+st.name);
	
	}

}
