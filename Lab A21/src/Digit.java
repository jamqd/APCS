public class Digit
{
    int value;
    int base;
    
    /**
     * Default constructor to initialize the value
     * to zero and base to 10
     */
    public Digit()
    {
      	value = 0;
      	base = 10;
    }
    /**
     * Constructor to initialize the value and 
     * base of this Digit to the given values
     * @param val initial value
     * @param b base
     */
    public Digit(int val, int b)
    {
      	value = val;
      	base = b;
    }
    /**
     * Method to return the digit as a string for
     * printing
     */
    public String toString()
    {
        return "" + value;
	
    }
    /**
     * Method to increment the digit by 1
     * @return true if there is carry, false otherwise
     */
    public boolean increment()
    {
      	if(value == base -1){
      		value = 0;
      		return true;
      	}else{
      		value++;
      		return false;
      	}
    	
	
    }
    
    
}
