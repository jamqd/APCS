
/**
 * @author John Dang
 * @period 3
 */
import java.io.File;
import java.util.Scanner;

public class Life {
	private int N;
	private boolean[][] life;

	/**
	 * constructor reads in the data from the given file and sets up the life
	 * matrix
	 * 
	 * @param fname
	 *            - name of file
	 */
	public Life(String fname) {
		life = new boolean[20][20];
		try {
			Scanner in = new Scanner(new File(fname));
			N = in.nextInt();
			for (int i = 0; i < N; i++) {
				life[in.nextInt() - 1][in.nextInt() - 1] = true;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * method to print the life matrix
	 */
	public void printMatrix() {
		System.out.println("      12345678901234567890");
		System.out.println();
		int count = 1;
		for (boolean[] a : life) {
			System.out.print(count + "     ");
			for (boolean b : a) {
				if (b) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			count++;
			System.out.println();
		}
	}

	/**
	 * Method to count the number of neighbors of the given cell in the life
	 * matrix
	 * 
	 * @param row
	 *            - row number
	 * @param col
	 *            - column number
	 * @return - number of neighbors of the given cell
	 */
	public int numberOfNeighbors(int row, int col) {
		int nCount = 0;
		for (int i = row - 1; i <= row + 1; i++) {
			for (int j = col - 1; j <= col + 1; j++) {
				try {
					if (life[i][j] && (i != row || j != col)) {
						nCount++;
					}
				} catch (Exception e) {
					continue;
				}
			}
		}
		return nCount;

	}

	/**
	 * method to determine if given cell is empty
	 * 
	 * @param row
	 *            - cell row number
	 * @param col
	 *            - cell column number
	 * @return true if it is empty, false otherwise
	 */
	private boolean isEmpty(char[][] mat, int row, int col) {
		if (!life[row][col]) {
			return true;
		}
		return false;
	}

	/**
	 * method that simulates the game of life
	 */
	public void generation() {
		boolean[][] nGen = new boolean[life.length][life[0].length];
		for (int i = 0; i < life.length; i++) {
			for (int j = 0; j < life[0].length; j++) {
				if (life[i][j]) {
					if (numberOfNeighbors(i, j) >= 4) {
						nGen[i][j] = false;
					} else if (numberOfNeighbors(i, j) == 1 || numberOfNeighbors(i, j) == 0) {
						nGen[i][j] = false;
					} else {
						nGen[i][j] = true;
					}
				} else {
					if (numberOfNeighbors(i, j) == 3) {
						nGen[i][j] = true;
					}
				}
			}
		}
		life = nGen;
	}

	/**
	 * Method to print the statistics
	 */
	public void printStatistics() {
		int rCount = 0;
		for (int i = 0; i < life[0].length; i++) {
			if (life[9][i]) {
				rCount++;
			}
		}
		System.out.println("Number in Row 10 ---> " + rCount);
		int cCount = 0;
		for (int i = 0; i < life.length; i++) {
			if (life[i][9]) {
				cCount++;
			}
		}
		System.out.println("Number in Column 10 ---> " + cCount);
		int count = 0;
		for (int i = 0; i < life.length; i++) {
			for (int j = 0; j < life[0].length; j++) {
				if (life[i][j]) {
					count++;
				}
			}
		}
		System.out.println("number of living organisms ---> " + count);
	}
}
