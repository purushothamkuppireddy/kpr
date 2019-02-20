package exercise;
import java.util.Scanner;
public class Trainseat {

	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//int seatnos[]=new int[];
		int s=n%12;
		switch(s)
		{
		case 0:System.out.println("seat no"+(n-11)+" ws");break;
		case 1:System.out.println("seat no"+(n+11)+" ws");break;
		case 2:System.out.println("seat no"+(n+9)+" ms");break;
		case 3:System.out.println("seat no"+(n+7)+" as");break;
		case 4:System.out.println("seat no"+(n+5)+" ms");break;
		case 5:System.out.println("seat no"+(n+3)+" ms");break;
		case 6:System.out.println("seat no"+(n+1)+" as");break;
		case 7:System.out.println("seat no"+(n-1)+" ws");break;
		case 8:System.out.println("seat no"+(n-3)+" ms");break;
		case 9:System.out.println("seat no"+(n-5)+" as");break;
		case 10:System.out.println("seat no"+(n-7)+" as");break;
		case 11:System.out.println("seat no"+(n-9)+" ms");break;
			
		
		
		}
		
		
		
	}

}
