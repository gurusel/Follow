package Encryption;

import java.util.Base64;

public class Decoding {

	//Decode Basic Base 64 format to String
	public static void main(String[] args) {
		
		//Create an encoded string to decode
		String encoded="TmF0YXJhag==";
		
		//print the encoded string
		System.out.println("Encoded String: "+encoded);
		
		//Decode using Base 64
		byte[] actualByte=Base64.getDecoder().decode(encoded);
		
		String actualString=new String(actualByte);
		
		//print the Actual String
		System.out.println("Decoded String: "+actualString);
	}
}
