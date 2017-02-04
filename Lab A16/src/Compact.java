import java.util.*;
import java.io.*;
/**
 * 
 * @author John Dang
 * @period 3
 * 
 * program to read integers from a text file, read them into an array, and remove zero values
 */
public class Compact 
{	
	private int[]integers;
	private int[]temp = new int[100];
	/**
	 * Constructor that reads integers from a text file and stores them in an array
	 * @param name - the file name
	 */
	public Compact(String name){
		try{
			Scanner io = new Scanner(new File(name));
			int index = 0;
			while(io.hasNextInt()){
				temp[index] = io.nextInt();
				index++;
			}
			integers = new int[index + 1];
			for(int a = 0; a < index; a++){
				integers[a] = temp[a];
			}
			System.out.print("Before: ");
			for (int j = 0; j < integers.length - 1; j++) {
				System.out.print(integers[j] + " ");
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	/**
	 * Removes zeros from the array
	 */
	public void compactIt(){
		int fPos = 0;
		for(int a = 0; a < integers.length; a++){
			if (integers[a] != 0){
				integers[fPos] = integers[a];
				integers[a] = 0;
				fPos++;
			}
		}
		System.out.println();
		System.out.print("After: ");
		for (int j = 0; j < integers.length - 1; j++) {
			System.out.print(integers[j] + " ");
		}
	}
}
