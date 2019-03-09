package Lambda;

public class Greeter {
	
	public void greet(Greeting greeting) {
		greeting.perform();
		
	}
	

	public static void main(String[] args) {
		//implementing interface
		Greeter greeter=new Greeter();
		greeter.greet(new HelloWorldGreetingimpl());
		
		//Lambda expression and Greeting is interface is used as type for mylambda
		Greeting mylambda=()->System.out.println("hii welcome");
		greeter.greet(()->System.out.println("hii welcome"));
		
		
		Greeting innerClassGreeting=new Greeting() {
			public void perform()
			{
				System.out.println("inner class implementation");
			}
		};
		greeter.greet(innerClassGreeting);
		
	}

}
