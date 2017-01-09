import java.io.*;
import java.util.*;

/**
 * 
 * @author John Dang 
 * Period 3
 * 
 * Program to calculate average of numbers in a text file
 */
public class Average {
	private long total;
	private int count;
	private double average;
	private String name;

	/**
	 * Constructor for the Average class
	 * @param fileName - the name of the file
	 */
	public Average(String fileName) {
		name = fileName;
		total = 0;
		count = 0;
		average = 0;
	}

	/**
	 * Method to read file and calculate average if the numbers in the file
	 */
	public void scanDataAndCalculateAverage() {
		try {
			File f = new File(name + ".txt");
			Scanner in = new Scanner(f);
			if(!f.exists()){
				throw new Exception("Error" + name + ".txt (The system cannot find the fiel specified");
			}
			if (!in.hasNext()) {
				throw new Exception(name + ".txt is empty");
			}
			if (!in.hasNextInt()) {
				throw new Exception(name + ".txt" + " is empty does not hace numeric data");
			}
			while (in.hasNextInt()) {
				total += in.nextInt();
				count++;
				average = (double) total / count;
			}
			System.out.println("Average = " + average);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
