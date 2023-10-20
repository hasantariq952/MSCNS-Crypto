package RSAv1;

public class RSAv2 
{

	public static void main(String[] args)
	{
		// 1. Variables : p & q
		int p =3, q=11;
		
		// 2. Calculate n
		int n = p*q;
		
		// 3. Calculate phi[n]
		int phiN = (p-1)*(q-1);
		
		/* 4. Choose a value for e such that it 
		 *    - e is greater than 1
		 *    - e is less than phiN
		 *    - e is co-prime with phiN
		 */ 
		int e = 0;
		
		// Use a LOOP of some sort to work out the value of e.
		for(int testVal=2; testVal<phiN; testVal++)
		{
			
			// If phiN % testVal does not equal 0 this IS an appropriate choice for e.
			if(phiN % testVal!=0)
			{
				// System.out.println(testVal+" is an appropriate choice for e");
				e = testVal; // assign e the value of testVal
				break; 		// exit the FOR loop
			}
						
		} // end of FOR LOOP
		
		// Display values of p and q
		System.out.println("---------------------------");
		System.out.println("           RSA Algorithm in Java V2.0         ");
		System.out.println("(c) Brendan Fogarty, Griffith College Limerick");
		System.out.println("p: "+p);
		System.out.println("q: "+q);
		
		System.out.println("---------------------------");
		// Display the Public Key
		System.out.println("Public Key [e, n]: "+e+" , "+n);
		
		// Encrypt a message of M = 4 using the Public Key
		
		// Formula: C = M^e MOD n
		int M = 4;
		
		// Refer to: https://www.baeldung.com/java-math-pow
		int  c = (int) Math.pow(M, e) % n;
		
		// Display the ciphertext
		System.out.println("Message: "+M);
		System.out.println("Ciphertext: "+c);
		
		/* --- Work out the PRIVATE KEY ---
		  
		  Solve this equation, for d: 
		  
		  e * d mod phiN = 1.
		*/
		int exit=0;
		int d = 2;
		
		// Do not exit loop until a match is found for d
		while(exit==0)
		{
			// if current value of d solves equation - exit while loop.
			if(e*d%phiN==1)
			{
				exit = 1;
				break;
			}
			
			d++; // increment d
		}
		System.out.println("---------------------------");
		System.out.println("Private Key: [d,n] "+d+" , "+ n);
		
		// Decrypt the ciphertext using the private key
		// Formula: C^d mod n
		int plainText = (int) (Math.pow(c, d)%n);
		
		// Display plainText
		System.out.println("Encrypted Message: "+c);
		System.out.println("Decrypted Message: "+plainText);

	}

}