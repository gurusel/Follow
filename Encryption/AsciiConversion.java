package Encryption;

import java.math.BigInteger;

public class AsciiConversion {

	public static void main(String[] args) {
		
		
		 	String str = "Nataraj";  // or anything else
		 	
		 	System.out.println("Input String: "+str);
		 	
		 	System.out.println("Ascii values: ");
		    StringBuilder sb = new StringBuilder();
		    for (char c : str.toCharArray())
		    {
		    	
		    System.out.println((int)c);
		    sb.append((int)c);
		    
		    }
		    BigInteger mInt = new BigInteger(sb.toString());
		    System.out.println("Concatenated String : "+mInt);
		    
	}

}
