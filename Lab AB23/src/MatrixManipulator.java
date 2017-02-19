import java.util.*;
import java.io.*;

/**
 * Chapter AB23 - Two-Dimensional Arrays Exercises
 * 
 * @author John Dang
 * @version version
 * @author Period 3
 * @author Assignment - MatrixManipulator
 */
public class MatrixManipulator {
	Scanner scan;
	/**
	 * Constructor creates scanner object
	 */
	public MatrixManipulator() {
		scan = new Scanner(System.in);
	}

	/**
	 * Returns sum of all elelment an integer array
	 */
	public int sumOfAllArrayElements(int[][] data) {
		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				sum += data[i][j];
			}
		}
		return sum;
	}

	/**
	 *Returns an array consisting of the sums of each row in the 2d array
	 */
	public int[] sumOfEachRow(int[][] data) {
		// declare the row sum array
		int[] rowSums = new int[data.length];
		// compute the sums for each row
		for (int row = 0; row < data.length; row++) {
			// initialize the sum
			int sum = 0;
			// compute the sum for this row
			for (int i = 0; i < data[row].length; i++) {
				sum += data[row][i];
			}
			rowSums[row] = sum;
		}
		return rowSums;
	}

	/**
	 * Returns an array consisting of the sums of each row in the 2d array
	 */
	public int[] sumOfEachColumn(int[][] data) {
		// find the longest row
		int longest = 0;
		for (int j = 0; j < data.length; j++) {
			if (data[j].length > longest) {
				longest = data[j].length;
			}
		}

		// declare the col sum array
		int[] colSums = new int[longest];
		// compute the sum of each column
		for (int col = 0; col < longest; col++) {
			int sum = 0;
			for (int i = 0; i < data.length; i++) {
				try {
					sum += data[i][col];
				} catch (Exception e) {

				}
			}
			colSums[col] = sum;
		}
		return colSums;
	}

	/**
	 * Returns a boolean value based on whether the 2d array is a magic square
	 */
	public boolean isMagic(int[][] data) {
		// check if the array is a magic square. This means that it must be
		// square,
		// and that all row sums, all column sums, and the two diagonal-sums
		// must all be equal.
		for (int[] a : data) {
			if (a.length != data.length) {
				return false;
			}
		}
		int[] rows = sumOfEachRow(data);
		int rLen = rows[0];
		for (int a : rows) {
			if (a != rLen) {
				return false;
			}
		}
		int[] cols = sumOfEachColumn(data);
		int cLen = cols[0];
		for (int a : rows) {
			if (a != cLen) {
				return false;
			}
		}
		int dSum1 = 0;
		for (int i = 0; i < data.length; i++) {
			dSum1 += data[i][i];
		}
		int dSum2 = 0;
		for (int i = 0; i < data.length; i++) {
			dSum2 += data[i][data.length - 1 - i];
		}
		return true;
	}

	/**
	 * Returns an array containing the minimum and maximum values of each element
	 */
	public int[] maxAndMinElements(int[][] data) {
		// declare the max and the min
		int max = data[0][0];
		int min = data[0][0];
		for (int[] a : data) {
			for (int b : a) {
				if (b > max) {
					max = b;
				}
				if (b < min) {
					min = b;
				}
			}
		}
		// compute the sum

		int[] result = { max, min };
		return result;
	}

	/**
	 * Returns an array containing the largest element in each row
	 */
	public int[] largestElements(int[][] data) {
		// declare the largest in row array
		int[] largestInRow = new int[data.length];
		// find the largest element in each row
		int count = 0;
		for (int[] a : data) {
			int max = 0;
			for (int b : a) {
				if (b > max) {
					max = b;
				}
			}
			largestInRow[count] = max;
			count++;
		}

		return largestInRow;
	}

	/**
	 * Reverses the element in each row of the 2d array
	 */
	public void reversalOfElementsInEachRow(int[][] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length / 2; j++) {
				int temp = data[i][j];
				data[i][j] = data[i][data[i].length - 1 - j];
				data[i][data[i].length - 1 - j] = temp;
			}
		}
		for (int[] a : data) {
			for (int b : a) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
	}

	/**
	 *Smoothes a 2d array of an image
	 */
	public int[][] imageSmootherEasy(int[][] image) {
		// assume a rectangular image
		int[][] smooth = new int[image.length][image[0].length];

		// Compute the smoothed value for
		// non-edge locations in the image.
		int sum = 0;
		for (int r = 0; r < image.length; r++) {
			for (int c = 0; c < image[r].length; c++) {
				if (r != 0 && r != image.length -1 && c != 0 && c!=image[r].length-1) {
					sum = image[r - 1][c - 1] + image[r - 1][c] + image[r - 1][c + 1] + image[r][c - 1]
							+ image[r][c] + image[r][c + 1] + image[r+1][c-1] + image[r+1][c ] + image[r+1][c+1];
					smooth[r][c] = sum / 9;
				} else {
					smooth[r][c] = 0;
				}
			}
		}

		return smooth;
	}

	/**
	 * Smoothes a 2d array of an image
	 */
	public int[][] imageSmootherHard(int[][] image) {
		// assume a rectangular image
		int[][] smooth = new int[image.length][image[0].length];
		int[][] copy = new int[image.length+2][image[0].length+2];
		for(int i = 0; i < smooth.length; i++){
			for(int j = 0; j < smooth[0].length; j++){
				copy[i+1][j+1] = image[i][j];
			}
		}
		for(int a = 0; a< copy[0].length; a++){
			copy[0][a] = 0;
			copy[copy.length-1][a] = 0;
		}
		for(int a = 0; a< copy.length; a++){
			copy[a][0] = 0;
			copy[a][copy[0].length-1] = 0;
		}
		// Compute the smoothed value for all
		// locations in the image.
		for(int i = 0; i < smooth.length; i++){
			for(int j = 0; j < smooth[0].length; j++){
				smooth[i][j] = imageSmootherEasy(copy)[i+1][j+1];
			}
		}

		return smooth;
	}

}
