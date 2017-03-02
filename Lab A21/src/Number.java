import java.util.ArrayList;
import java.util.*;
/**
 * 
 * @author John Dang
 * @period 3
 *
 * Class representing a number
 */
public class Number
{
    int value;
    int base;
    ArrayList<Digit> digits = new ArrayList<Digit>();
    /**
     * Default constructor to initialize the value to 
     * zero and the base to 10
     * Also initializes the digits
     */
    public Number()
    {
        value = 0;
        base = 10;
        digits.add(new Digit(0,10));
    }
    /**
     * Constructor to initialize the value and base of the number
     * to the given value and base. Also initializes the digits
     * @param val value
     * @param b base
     */
    public Number(int val, int b)
    {
        value = val;
        base  = b;
        int temp  = value;
        while(temp > base - 1){
        	digits.add(new Digit(temp % base, base));
        	temp /= base;
        }
        digits.add(new Digit(temp, base));
    }
    
    /**
     * Method to return the digitsList as String
     * @return String containing the digits of the number
     * 			in the given base
     */
    public String toString()
    {
        String s = "";
    	for(int i = digits.size()-1; i >= 0; i--){
        	s += digits.get(i).toString();
        } 
        return s;
	
    }
    /**
     * Method to increment the number by 1
     */
    public void increment()
    {
        for(Digit a: digits){
        	if(!a.increment()){
        		return;
        	}
        }
        digits.add(new Digit(1, base));
    }
 }
    
