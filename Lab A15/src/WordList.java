import java.util.*;
/**
 * 
 * @author John Dang
 * @period 3
 *
 */
public class WordList extends ArrayList<String>
{
	/**
	 * Constructor
	 */
	public WordList(){
		super();
	}
	/** 
   	* method to returns the number of words in this 
   	* WordList that are exactly len letters long 
   	* @param len - length of the words to search for 
   	* @return number of words in this list of length len 
   	*/ 
   	public int numWordsOfLength(int len) 
   	{ 
       	int count = 0;
   		for(String n: this){
       		if(n.length() == len){
       			count++;
       		}
       	}
   		return count;
   	} 
   	/** 
   	* All words that are exactly len letters long are removed from this 
   	* WordList, with the order of the remaining words unchanged 
   	* @param len - length of the word to remove 
   	*/ 
   	public void removeWordsOfLength(int len) 
   	{ 
   		Iterator i = this.iterator();
   		while (i.hasNext()) {
   		    String str = (String) i.next();
   		    if (str.length() == len)
   		        i.remove();
   		}
   	} 
   	/** 
   	* method to calculate the length of the longest word 
   	* @return length of the longest word 
   	*/ 
   	public int lengthOfLongestWord() 
   	{ 
       	int length = 0;
       	for(String n: this){
       		if(n.length() > length){
       			length = n.length();
       		}
       	}
       	return length;
   	} 

}
