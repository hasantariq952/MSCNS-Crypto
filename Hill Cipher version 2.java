package hillCipherv1;

public class hillCipherv2 {

	public static void main(String[] args) 
	{
		// Variables		
		String keyword = "dcdf", plainText = "code", engAlphabet = "abcdefghijklmnopqrstuvwxyz";
		
		// Plaintext Matrix - consists of keyword values in numeric form
		int[] plaintextMatrix = {engAlphabet.indexOf(plainText.charAt(0)), 
				                 engAlphabet.indexOf(plainText.charAt(1)), 
				                 engAlphabet.indexOf(plainText.charAt(2)), 
				                 engAlphabet.indexOf(plainText.charAt(3))};
		
		
		int[] ciphertextMatrix = {0, 0, 0, 0};
		
		
		// Integer Array containing keyword characters.
		int[] encryptMatrix = { engAlphabet.indexOf( keyword.charAt(0)), 
				                engAlphabet.indexOf( keyword.charAt(2)) , 
				                engAlphabet.indexOf( keyword.charAt(1)), 
				                engAlphabet.indexOf( keyword.charAt(3)) };
			
		
		
		// *** Encryption Process ***
		ciphertextMatrix[0] = (encryptMatrix[0]*plaintextMatrix[0] + encryptMatrix[1]*plaintextMatrix[1])%26;
		ciphertextMatrix[1] = (encryptMatrix[2]*plaintextMatrix[0] + encryptMatrix[3]*plaintextMatrix[1])%26;
		ciphertextMatrix[2] = (encryptMatrix[0]*plaintextMatrix[2] + encryptMatrix[1]*plaintextMatrix[3])%26;
		ciphertextMatrix[3] = (encryptMatrix[2]*plaintextMatrix[2] + encryptMatrix[3]*plaintextMatrix[3])%26;
	
		// Mapping the ciphertext values to alphabet characters.
		System.out.println(engAlphabet.charAt( ciphertextMatrix[0] ));
		System.out.println(engAlphabet.charAt( ciphertextMatrix[1] ));
		System.out.println(engAlphabet.charAt( ciphertextMatrix[2] ));
		System.out.println(engAlphabet.charAt( ciphertextMatrix[3] ));
		
		
		
	}

}