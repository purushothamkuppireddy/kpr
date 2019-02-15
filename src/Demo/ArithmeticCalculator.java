package Demo;
import java.util.Scanner;
public class ArithmeticCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1= 10;
		int num2= 20;
		System.out.println("Enter an operator");
		String S=sc.next();
		switch(S)
		{
			case "+": System.out.println(num1+num2);
		                break;
		    case "-": System.out.println(num1-num2);
		                break;
		     default : System.out.println("No operator");          
		}
		

	}

}
