package exceptiondemo;

public class Custom2exception {

	public static boolean isValid(Card card)throws InvalidPinException{
		if(card.pin==1000) {
			return true;
		
		}else throw new InvalidPinException("Pin is not valid");  
	}
	
	
	
}
