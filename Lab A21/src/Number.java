import java.util.ArrayList;
import java.util.*;

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
    }
    
    /**
     * Method to return the digitsList as String
     * @return String containing the digits of the number
     * 			in the given base
     */
    public String toString()
    {
        String s = "";
    	for(int i = 0; i <= digits.size(); i++){
        	s += digits.get(digits.size() - i).toString();
        } 
        return s;
	
    }
    /**
     * Method to increment the number by 1
     */
    public void increment()
    {
        for(Digit a: digits){
        	if(a.increment()){
        		           
        	}
        }
    }
 }
    
