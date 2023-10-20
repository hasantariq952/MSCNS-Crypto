package RSAv1;

public class RSAv1 
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
			
			// If phiN % testVal equals 0 this is NOT an appropriate choice for e.
			
			// If phiN % testVal does not equal 0 this IS an appropriate choice for e.
			
			// As phiN = 20 a choice of 2, 4, 5, 10 or 20 is not an appropriate choice 
			// for e as these values are a factor of 20.
			if(phiN % testVal==0)
			{
				System.out.println(testVal+" is not an appropriate choice for e");
			}
			else
			{
				System.out.println(testVal+" is an appropriate choice for e");
				e = testVal; // assign e the value of testVal
				break; 		// exit the FOR loop
			}
						
		} // end of FOR LOOP
		
		// Display the Public Key
		System.out.println("Public Key: "+e+" , "+n);
		
		// Encrypt a message of M = 4 using the Public Key
		
		// Formula: C = M^e MOD n
		int M = 4;
		
		// Refer to: https://www.baeldung.com/java-math-pow
		int  c = (int) Math.pow(M, e) % n;
		
		// Display the ciphertext
		System.out.println("Ciphertext: "+c);
		
		/* *** Work out the PRIVATE KEY ***
		  
		  Solve this equation, for d: 
		  
		  e * d mod phiN = 1.
		*/
		

	}

}