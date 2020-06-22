package Encryption;

import java.util.Base64;

public class Encoding {

	// Java program to encode string in Basic Base 64 format
	public static void main(String[] args) {
		
		//create a sample string to encode
		
		String sample="Nataraj";
		System.out.println("Sample String: "+sample);
		
		//Encode into Base64 Format
		String encodedValue=Base64.getEncoder().encodeToString(sample.getBytes());
		
		//print the output
		System.out.println("Encoded String: "+encodedValue);
	}
	
	
}
