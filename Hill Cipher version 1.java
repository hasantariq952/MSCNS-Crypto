package hillCipherv1;

public class hillCipherv1 {

	public static void main(String[] args) 
	{
		/*
		 *  Declare a String with the keyword ‘hill’, and a String containing the plaintext ‘node’.
			Declare a String variable named engAlphabet that contains all characters in the English alphabet.

		 */
		
		String keyword = "hill", plainText = "node", engAlphabet = "abcdefghijklmnopqrstuvwxyz";
		
		// Keyword 'hill' maps to
		// h(7) l(11)
		// i(8) l(11)
		
		// Plaintext 'node' maps to values {13, 14, 3, 4}
		// n(13) d(3) 
		// o(14) 3(4)
		int[] plaintextMatrix = {13, 14, 3, 4};
		int[] ciphertextMatrix = {0, 0, 0, 0};
		// Integer Array containing keyword
		int[] encryptMatrix = {7, 11, 8, 11};
		
		// *** Encryption Process (1st 2 chars) ***
		// 7 11 x 13
		// 8 11   14
 		// 1st ciphertext character : [(7x13) + (11x14)]%26
		ciphertextMatrix[0] = (encryptMatrix[0]*plaintextMatrix[0] + encryptMatrix[1]*plaintextMatrix[1])%26;
		// 2nd ciphertext character : [(8x13) + (11x14)]%26
		ciphertextMatrix[1] = (encryptMatrix[2]*plaintextMatrix[0] + encryptMatrix[3]*plaintextMatrix[1])%26;
		
		// *** Encryption Process (Last 2 chars) ***
		// 7 11 x 3
		// 8 11   4
		// 3rd ciphertext character: [(7x3) + (11x4)]%26
		ciphertextMatrix[2] = (encryptMatrix[0]*plaintextMatrix[2] + encryptMatrix[1]*plaintextMatrix[3])%26;
		// 4th ciphertext character: [(8x3) + (11x4)]%26
		ciphertextMatrix[3] = (encryptMatrix[2]*plaintextMatrix[2] + encryptMatrix[3]*plaintextMatrix[3])%26;
		
		// Display numerical representation of Ciphertext
		System.out.println(ciphertextMatrix[0]);
		System.out.println(ciphertextMatrix[1]);
		System.out.println(ciphertextMatrix[2]);
		System.out.println(ciphertextMatrix[3]);
		
		// In Class Task 1:
		// Convert the numerical form of the ciphertext to Characters in the Alphabet.
		// This should be performed automatically by the Application.
		
		// Mapping the first ciphertext value to an alphabet character.
		System.out.println(engAlphabet.charAt( ciphertextMatrix[0] ));
		System.out.println(engAlphabet.charAt( ciphertextMatrix[1] ));
		System.out.println(engAlphabet.charAt( ciphertextMatrix[2] ));
		System.out.println(engAlphabet.charAt( ciphertextMatrix[3] ));
		
		/* In Class Task 2
		 - Rework this application so THAT the numbers used in the encryption matrix and plaintext matrix
		 - are generated AUTOMATICALLY
		 - For a keyword of hill, encryptMatrix = {7,11,8,11};
		
	    *  In Class Task 3
	    *   - Test the Application
		*/
		
	}

}