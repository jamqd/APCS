import java.util.*;
import java.util.concurrent.SynchronousQueue;
/**
 *   
 * @author John Dang
 * @period 3
 * 
 * Class to simulate rolling a dice thrice until three different numbers are rolled
 */
  
public class Rolling {
	Random rand;
	/**
	 * constructor to initilize the random number
	 * generator
	 * @param s - seed for the random number generator
	 */
	public Rolling(int s)
	{
		rand = new Random(s);//makes new number generator
	}
	/**
	 * Method to simulate a dice roll
	 * @return an integer between 1 and 6
	 */
    private int roll() 
    { 
        return 1 + rand.nextInt(6);
    }
    
    /**  
     * Roll the dice three times and count the
     * number of tries it took to get all three
     * different rolls. In the end print a message
     * displaying the number of tries
     */
    public void play() {
        int a = 0;
        int b = 0;
        int c = 0;
        int count = 0;
    	while( (a==b || b == c || a ==c) || count == 0){
    		a = roll();
    		b = roll();
    		c = roll();
    		System.out.println(a + " " + b + " " + c);
    		count++;
    	}
    	System.out.println("Rolled " + count + " times before all the rolls were different");
    }


    /** 
     * Answer to question 3 goes here
     * 
     * When the loop is finished (a != b && b!= c && a != c) && count != 0
     */
  
} 
