/**
 * @author John Dang
 * @period 3
 * 
 * Program to generate random permutations of integers 1-10
 */
import java.util.*;

public class PermutationGenerator {
	private final ArrayList<Integer>perm = new ArrayList<Integer>(10);
	private Random rand;
	/**
	 * Constructor for PermutationGenerator class
	 * @param seed - seed for Random object
	 */
	public PermutationGenerator(int seed){
		rand = new Random(seed);
	}
	/**
	 * Generates random permutations
	 */
	public void nextPermutation(){
		ArrayList<Integer>list = new ArrayList<Integer>(10);
		for(int i = 1; i <= 10; i++){
			list.add(i);
		}
		Integer a;
		for(int z = 1; z <= 10; z++){
			a = new Integer(list.get(rand.nextInt(list.size())));
			perm.add(a);
			list.remove(a);
		}
	}
	/**
	 * Returns String of list of permutation
	 */
	public String toString(){
		String output = perm.toString();
		perm.clear();
		return output;
	}
}
