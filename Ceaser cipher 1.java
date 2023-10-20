package practical2;

public class practical2 
{

	
	public static void main(String[] args) 
	{
		
		
		// Task 1a - a.	Create a String variable containing all letters of the English alphabet
		String engAlphabet = "abcdefghijklmnopqrstuvwxyz";
		
		// Task 1b - b.	Create a char variable called plaintext and store the first character of your 
		// surname in it
		char plainText = 'u';

		// Task 1c - Create a integer variable called key and assign it a value of 5
		int key = 15;
		
		// Display value of engAlphabet

		
		// Task 1d - Create a variable to store the integer form of the char variable to be encrypted
		// Take the value in the value plaintext AND convert to its numerical form
		// i.e. a=0, b=1, c=2, .....,z=25.
		
		// You will need to use a METHOD to do this automatically 
		// e.g. indexOf(), charAt(), equals() etc.
		
		// String Methods: https://www.w3schools.com/java/java_ref_string.asp
		int plaintextInt = engAlphabet.indexOf(plainText);

		
		// Task 1e - Create a variable to store the integer form of the encrypted character
		int ciphertextInt;
		
		// Task 1f - Encrypt the plaintext character using the Caesar cipher and the integer value stored in
		// the variable named key
		// Formula: c = (p + k) mod26
		ciphertextInt = (plaintextInt + key)%26;
		
		
		// Task 1g - Display the plaintext and ciphertext characters
		char cipherText = engAlphabet.charAt(ciphertextInt);
		System.out.println("*** Caesar Cipher Encrytion and Decryption v1.0 ***");
		System.out.println("Plaintext: "+plainText);
		System.out.println("Key: "+key);
		System.out.println("Ciphertext: "+cipherText);
		
		// Task 1h - Decrypt the character stored in the variable cipherText
	
		// j = 9, key = 15. 
		// (9 - 15) %26
		// (9 -15) = -6, this is not permitted.
		// Number in brackets must be positive before we get mod 26 of result.
		if(ciphertextInt - key<0)
		{
			plaintextInt = ( (ciphertextInt - key) +26 ) %26 ;
		}
			
		
		plainText = engAlphabet.charAt(plaintextInt);
		System.out.println("Decrypted Ciphertext (Plaintext): "+plainText);
		
		// Task 1i - Verify your code works for different chars and key values
		// e.g. plaintext = 'u', key = 15.
		
		
				
	}

}