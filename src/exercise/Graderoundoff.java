package exercise;

import java.util.Scanner;

public class Graderoundoff {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enetr the no of students");
		int n=sc.nextInt();
		int grades[]=new int[n];
		System.out.println("enetr the grades");
		
		for (int i = 0; i < grades.length; i++) 
		{
		 grades[i]=sc.nextInt();
		 
		}
		
		
			int temp;
			for (int i = 0; i <grades.length; i++)
			        {
			    
			            if(grades[i]<38)
			            {
			            	System.out.println(grades[i]); 
			              
			            }
			            
			            else
			            {
			                temp=grades[i];

			               while(temp%5!=0)
			               {
			            
			                 temp++ ;  
			               }
			               if(temp-grades[i]<3)
			               {
			                   grades[i]=temp;
			                   System.out.println(grades[i]);
			               }
			               else
			               {
			                  System.out.println(grades[i]);
			               }
			                            
			            }
			        }
	}}
	

