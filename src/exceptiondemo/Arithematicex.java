package exceptiondemo;

public class Arithematicex {
public static void main(String[] args)
{
	int a=5;
	String n="Bob";
	int arr[]= {2,3,4};
	System.out.println("start");
	
	//System.out.println(2/0);
	
	try {
		//System.out.println(a/0);
		System.out.println(2/0);
		//System.out.println(arr[7]);
	}
	
catch(ArithmeticException e){
	System.out.println(e);
	
}
	/*catch(ArrayIndexOutOfBoundsException e){
		System.out.println(e);
		
	}
	catch(Exception e){
		System.out.println("end");
		
	}
	/*catch(NullPointerException e)
	{
		System.out.println(e);
	}*/
	System.out.println("end1");
}
}
	

