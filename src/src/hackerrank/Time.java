package hackerrank;
import java.util.Scanner;
public class Time {
public static void main(String[] args)
{
	Scanner sc =new Scanner(System.in);
	String s=sc.next();
	String arr[]= s.split(":");
	String AP=arr[2].substring(2,4);
	int hh=Integer.parseInt(arr[0]);
	int mm=Integer.parseInt(arr[1]);
	int ss=Integer.parseInt(arr[2].substring(0,2));
	if(AP.equals("PM"))
	{
		if(hh<12)
		{
		hh=hh+12;
		}
		
	}
		
		//System.out.println(hh+":"+mm+":"+ss);
	
	else if(AP.equals("AM")&&(hh==12))
	{
		hh=0;
	}

	System.out.println(hh+":"+mm+":"+ss);
	}

}

	

