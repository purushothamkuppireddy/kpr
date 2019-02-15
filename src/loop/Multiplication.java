package loop;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		byte x=sc.nextByte();
		int i=1;
		//System.out.println(+i+x);
		while(i<=10 )
		{
			int mul=x*i;
			System.out.println(x+"*"+i+"="+mul);
			i++;
		}
		
	}

}
