package date;
import java.util.*; 
import java.text.*; 

public class Numberformat {
 
	  public static void main(String[] args) { 
	    double d = 123456.789; 
	    NumberFormat f1 = NumberFormat.getInstance(Locale.ITALY); 
	    NumberFormat f2 = NumberFormat.getInstance(Locale.UK); 
	    NumberFormat f3 = NumberFormat.getInstance(Locale.ENGLISH); 
	   
	    
	    System.out.println("ITALY representation of " + d + " : " + f1.format(d)); 
	    System.out.println("UK representation of " + d + " : " + f2.format(d)); 
	    System.out.println("ENGLISH representation of " + d + " : " + f3.format(d)); 
		  
	  
	  
	  } 
	} 
	
	

