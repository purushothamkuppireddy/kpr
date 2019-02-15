package conditional;

import java.util.Scanner;

public class big_number {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		short a=sc.nextShort();
		
		System.out.println("enter second number");
		short b=sc.nextShort();
		System.out.println("enter third number");
		short c=sc.nextShort();
		if(a>b&&a>c)
			System.out.println(a+" is bigger");
		else if(b>a&&b>c)
			System.out.println(b+" is bigger");
		else if(c>a&&c>b)
			System.out.println(c+" is bigger");
		else
			System.out.println("given numbers are equal ,plz give unequal numbers");
	}
}
