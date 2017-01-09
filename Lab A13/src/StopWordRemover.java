import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

/**
 * 
 * @author John Dang period 3
 *
 */
public class StopWordRemover {
	String stopList = "a an the for of at on in to her she him his he her's and with was is";
	String inFile, outFile;
	int maxLineLength;

	/**
	 * Initializes the input and output files and the max characters per line
	 * 
	 * @param in
	 *            - name of input file
	 * @param out
	 *            - name of output file
	 * @param max
	 *            - max characters per line (including spaces)
	 */
	public StopWordRemover(String in, String out, int max) {
		inFile = in;
		outFile = out;
		maxLineLength = max;
	}

	/**
	 * Removes the stop words and outputs the text to a file Each line of output
	 * is not more than max characters long
	 * 
	 * @return the number of words removed
	 */
	public int removeStopWords() {
		int count = 0;
		String output = "";
		File f;
		Scanner in;
		try {
			f = new File(inFile);
			in = new Scanner(f);
			String a;
			while (in.hasNext()) {
				a = in.next();
				if (stopList.indexOf(a.toLowerCase()) == -1) {
					output += a + " ";
				}else{
					count++;
				}
			}
			in.close();
		} catch (FileNotFoundException i) {
			System.out.println(i.getMessage());
		}
		FileWriter file;
		try {
			file = new FileWriter(outFile);
			String temp;
			while (output.length() > 0) {
				if (output.length() > maxLineLength) {
					temp = output.substring(0, maxLineLength) + "\n";
					file.write(temp);
					output = output.substring(maxLineLength);
				} else {
					file.write(output);
					output = "";
				}
			}
			file.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return count;
	}

}
