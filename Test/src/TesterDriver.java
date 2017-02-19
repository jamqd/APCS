import java.util.Arrays;
import java.util.Formatter;
public class TesterDriver {
	public static void main(String[] args) {
		int [][] table = new int[11][11];
		for(int i = 1; i < 11; i++){
			table[0][i] = i;
		}
		for(int j = 1; j < 11; j++){
			table[j][0] = j;
		}
		for (int row = 1; row < table.length ; row++)
	    {
	        for (int column = 1; column < table[row].length; column++)
	        {
	             table[row][column] = (row)*(column);
	        }

	    }
	    for(int[] a: table){
	    	for(int b: a){
	    		System.out.printf("%4d", b);
	    	}
	    	System.out.println();
	    }
	}
}
