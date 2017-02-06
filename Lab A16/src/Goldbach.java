
/**
 * Computes all primes less than N and tries to express N as a sum of two
 * primes. Goldbach's conjecture says that this is always possible if N is even
 * and greater than 2. When N is odd, these are called prime pairs.
 * 
 * @author John Dang
 *  period 3
 */
public class Goldbach {
	private Eratosthenes e;
	private final int N;

	/**
	 * Constructor creates the list of primes using the class Eratosthenes and
	 * initializes N to the passed in value of n
	 * 
	 * @param n
	 *            - number to be written as a sum of two primes
	 */
	public Goldbach(int n) {
		N = n;
		e = new Eratosthenes(N);
	}

	

	/**
	 * Returns a string that includes all the prime pairs that add up to N
	 * 
	 * @return string with the all the prime pairs that add up to N
	 */
	public String sumOfTwoPrimes() {
		String output = "" + N;
		int[] numbers = new int[100];
		int count = 0;
		boolean contains = false;
		for(int a: e.listOfPrimes()){
			for(int b: e.listOfPrimes()){
				for(int c: numbers){
					if(a == c || b ==c){
						contains = true;
					}
				}
				if(a+b == N && !contains){
					output += " = " + a + " + " + b;
					numbers[count] = a;
					count++;
					numbers[count] = b;
					count++;
				}
				contains = false;
			}
		}
		if(output.equals("" + N)){
			return output + " not expressible as sum of two primes";
		}else{
			return output;
		}
	}
}
