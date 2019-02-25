package wrapperEx;
import java.util.Scanner;

public class ObjectPassingDemo {
Student s=new Student();
Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ObjectPassingDemo o=new ObjectPassingDemo();
Student s1=new Student();
//s1=o.accept();
o.display(o.accept());	
	}
	
	
	public  void display( Student s1)
	{
		System.out.println(s.getName());
		System.out.println(s.getRoll());
		System.out.println(s.getFees());
	
	}
	
public Student accept()

{
System.out.println("enetr name:");
	s.setName(sc.next());
	System.out.println("enetr roll:");
	s.setRoll(sc.nextInt());
	System.out.println("enetr fees:");
	s.setFees(sc.nextInt());
return s;
	
}





}




