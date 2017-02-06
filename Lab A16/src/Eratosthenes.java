/**
 * Determines the primes less than or equal to n using the 
 * Sieve of Eratosthenes
 * @author John Dang
 * period 3
 *
 */
public class Eratosthenes {
	
	private boolean[]primes;
	private int[]primeList;
	private int num;
	
	/**
	 * Constructor to initialize array of primes using the Sieve of Eratosthenes
	 * @param n - all primes are less than or equal to n
	 */
	public Eratosthenes (int n)
	{
		num = n;
		primes = new boolean[n+1];
		listOfPrimes();
		
	}
	/** Count the number of primes
	 * 
	 * @return number of primes less than or equal to n
	 */
	public int countPrimes()
	{
		int primesCount = 0;
		for(int i = 2; i <= num; i++){
			if(primes[i]){
				primesCount++;
			}
		}
		return primesCount;
	}
	/**
	 * returns a list of primes less than or equal to n
	 * @return
	 */
	public int[] listOfPrimes()
	{
		for(int a = 2; a <= num; a++){
			primes[a] = true;
		}
		for(int b = 2; b*b <= num; b++){
			if(primes[b]){
				for(int c = b; b*c <= num; c++){
					primes[b*c] = false;
				}
			}
		}
		primeList = new int[countPrimes()];
		int count = 0;
		for(int i = 2; i <= num; i++){
			if(primes[i]){
				primeList[count] = i;
				count++;
			}
		}
		return primeList;
	}
	/**
	 * Returns a string containing the prime numbers and the number of prime numbers
	 * in the list
	 */
	public String toString()
	{
		String s = "";
		for(int a: primeList){
			s+= a + " ";
		}
		s+= "\n" + "Number of primes less than or equal to " + num + " = " + countPrimes();
		return s;
	}
}
