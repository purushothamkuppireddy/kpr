package exception;

public class ArithmeticEx {
public static void main(String[] args) throws ArrayIndexOutOfBoundsException
{
	int a=5;
	String n="Bob";
	int arr[]= {2,3,4};
	System.out.println("start");
	
	//System.out.println(2/0);
	int x=6;
	if(x!=7)
	{
		
		throw new ArithmeticException("x is not equal to 7");
	
	}
		
	
	try {
		System.out.println(a/0);
		
		System.out.println(2/0);
		//System.out.println(arr[7]);
		
	}
	
catch(ArithmeticException e){
	System.out.println(e);
	
}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println(e);
		
	}
	/*catch(Exception e){
		System.out.println("end");
		
	}*/
	catch(NullPointerException e)
	{
		System.out.println(e);
	}
	System.out.println("end1");
}

}

