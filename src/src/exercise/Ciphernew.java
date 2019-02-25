package exercise;

public class Ciphernew {

public static StringBuilder encryption(String message,int key)	
{
	char[] letters=message.toCharArray();
	StringBuilder encmsg=new StringBuilder();
for (int i = 0; i < letters.length; i++) 
{
	encmsg.append((char)(byte)(letters[i]+key));
	
	
}
	System.out.println(encmsg);
	return encmsg;

}
public static void decryption(StringBuilder encmsg)
{
	String msg=encmsg.toString();
	char[] letters= msg.toCharArray();
	StringBuilder dcmsg=new StringBuilder();
	for (int i = 0; i < letters.length; i++) 
	{
		dcmsg.append((char)(byte)(letters[i]-3));
		
		
	}
	System.out.println(dcmsg);

	
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
decryption(encryption("Hello-",3));
	}

}
