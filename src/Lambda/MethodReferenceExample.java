package Lambda;

public class MethodReferenceExample {

	public static void main(String[] args) {
	//Thread th=new Thread(()->printmessage());
	Thread th=new Thread(MethodReferenceExample::printmessage);//MethodReferenceExample::printmessage==()->printmessage()
	
	
	th.start();
	}
	public static void printmessage()
	{
		System.out.println("hello");
	}

}
