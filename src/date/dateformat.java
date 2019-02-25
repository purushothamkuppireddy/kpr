package date;
//import java.time.format.DateTimeFormatter;  
//import java.time.LocalDateTime;    
import java.text.SimpleDateFormat;
import java.util.Date;  

public class dateformat {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY hh:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now));  
		   */  
		   
	  
	
	public static void main(String[] args) {  
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date(); 
	    String s=formatter.format(date);
	    System.out.println(s);  
	} 
	  
		
	}


