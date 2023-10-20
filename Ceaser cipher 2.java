package javaPracticalWeek3;

public class javaPracticalWeek3 
{

	
	public static void main(String[] args) 
	{
		// V2.0 of the Java Caesar Cipher Application.
		// This version can encrypt several characters simultaenously
		
		//1a. Create an integer variable called key and assign it a value of 11.
		int key = 11;
		
		// 1b[i]. Create a String variable and assign it the letters of the alphabet
		String engAlphabet = "abcdefghijklmnopqrstuvwxyz";
		
		// 1b[ii]. Create a String variable called plaintextString and assign it
		// a value of your first name.
		String plaintextString = "brendan";
		
		// 1c. Create an integer array called plaintextIntArray and a character array 
		// called plaintextCharArray
		int[] plaintextIntArray = {0,0,0,0,0,0,0};  // Integer Array initialised to 0
		char[] plaintextCharArray; 					// Char Arrays

		// Task 1d. Convert each of the characters in plaintextString to their 
		// numeric equivalent and store in plaintextIntArray
		// e.g. a=0, b=1, c=2, .... z=25
		
		// For loop will convert each of the characters in plaintextString to their
		// numeric equivalent.
		
		System.out.println("*** Plaintext Values ***");	
		for(int i=0; i<7; i++)
		{
			/*
			 * When i equals 0
			 *  Store the numeric equivalent of the first character in plaintextString at position 0 of
			 *  plaintextIntArray
			 *  
			 *  plaintextIntArray[0] = 
			 *  engAlphabet.indexOf(plaintextString.charAt(0))
			 *  ***********************************************
			 *  
			 *  When i equals 1
			 *   Store the numeric equivalent of the second character in plaintextString at position 1 of
			 *   plaintextIntArray
			 *  
			 *   plaintextIntArray[1] = 
			 *   engAlphabet.indexOf(plaintextString.charAt(1))
			 *  
			 *  ***********************************************
			 *  
			 *  When i equals 2
			 *   Store the numeric equivalent of the third character in plaintextString at position 2 of
			 *   plaintextIntArray
			 *  
			 *   plaintextIntArray[2] = 
			 *   engAlphabet.indexOf(plaintextString.charAt(2))
			 *   
			 *   ***********************************************
			 *   
			 *   The above repeats until all characters in plaintextString are converted to their numeric equivalent
			 *    
			 *    
			 */
			
			plaintextIntArray[i] = engAlphabet.indexOf(plaintextString.charAt(i));
			System.out.println(plaintextIntArray[i]);
		
		}
			
		/*
		 * Task 1e. Create a char array called ciphertextCharArray array (to store ciphertext characters)
		 */
		char[] ciphertextCharArray = {'z','z','z','z','z','z','z'};
		/*
		 * Task 1f. Create an Integer array called ciphertextIntArray 
		 * (to store the numeric form of ciphertext characters)
		 */
		int[] ciphertextIntArray = {0,0,0,0,0,0,0}; // initialised to 0
		
		/*
		 * Task 1g. Encrypt each value in plaintextIntArray using the Caesar cipher 
		 * (and the key value of 11). 
		 * Store the result of each encryption in ciphertextIntArray.
		 * 
		 * Formula: C = (p+k) mod 26
		 */
		System.out.println("*** Ciphertext Values ***");
		for(int i=0; i<7; i++)
		{
			ciphertextIntArray[i] = (plaintextIntArray[i]+key)%26;
				
			System.out.println(ciphertextIntArray[i]);
		}
		
		
		// Task 1h. Map each value in ciphertextIntArray to the appropriate character in the 
		// alphabet and store in ciphertextCharArray
		System.out.println("Plaintext: "+plaintextString);
		System.out.println("Key Value: "+key);
		
		System.out.print("Ciphertext: ");
		for(int i=0; i<7; i++)
		{
			// Convert each value in ciphertextIntArray to a character
			ciphertextCharArray[i] = engAlphabet.charAt( ciphertextIntArray[i]);
			
			// Display the values at index i of ciphertextCharArray
			System.out.print(ciphertextCharArray[i]);
		}			
		
		
		
	}
	
	
	

}