
import java.util.Scanner;


public class Driver {
	/**
     * Testing method: instantiates a Lesson49C Exercises object and then
     * invokes each method
     * 
     * @param args
     *            command line parameters (not used)
     */
	public static void main( String[] args )
    {
        Scanner kbd = new Scanner( System.in );
        boolean done = false;

        MatrixManipulator exercise = new MatrixManipulator();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "   (1) Sum of All Array Elements" );
            System.out.println( "   (2) Sum of Each Row" );
            System.out.println( "   (3) Sum of Each Column" );
            System.out.println( "   (4) Is magic square");
            System.out.println( "   (5) Maximum and Minimum Elements" );
            System.out.println( "   (6) Largest Elements" );
            System.out.println( "   (7) Reversal of Elements in Each Row" );
            System.out.println( "   (8) Image Smoother (Easy)" );
            System.out.println( "   (9) Image Smoother (Hard)" );
            System.out.println( "   (Q) Quit" );
            System.out.println();
            System.out.print( "Enter a choice:  " );
            String response = kbd.nextLine();

            if ( response.length() > 0 )
            {
                System.out.println();

                switch ( response.charAt( 0 ) )
                {
                    case '1':
                        int[][] dataEx1 = { { 3, 2, 5 }, { 1, 4, 4, 8, 13 },
                            { 9, 1, 0, 2 }, { 0, 2, 6, 3, -1, -8 } };
                        int sum = exercise.sumOfAllArrayElements( dataEx1 );
                        System.out.println("Sum of all array elements " + sum);
                        break;
                    case '2':
                        int[][] dataEx2 = { { 3, 2, 5 }, { 1, 4, 4, 8, 13 },
                            { 9, 1, 0, 2 }, { 0, 2, 6, 3, -1, -8 } };
                        int[] rowSums = exercise.sumOfEachRow( dataEx2 );
                        System.out.print("Row sums = ");
                        for (int i = 0; i < rowSums.length; i++)
                        	System.out.print(rowSums[i] + " ");
                        System.out.println();
                        break;
                    case '3':
                        int[][] dataEx3 = { { 3, 2, 5 }, { 1, 4, 4, 8, 13 },
                            { 9, 1, 0, 2 }, { 0, 2, 6, 3, -1, -8 } };
                        int[] colSums = exercise.sumOfEachColumn( dataEx3 );
                        System.out.print("Column sums = ");
                        for (int i = 0; i < colSums.length; i++)
                        	System.out.print(colSums[i] + " ");
                        System.out.println();
                        break;
                    case '4':
                    	int[][] dataEx4a = { { 1, 0, 0, 0 }, { 0, 2, 0, 0 },
                    			{ 0, 0, 3, 0 }, {0, 0, 0, 4 } };
                    	 for (int i = 0; i < dataEx4a.length; i++)
                    	 {
                    		 for(int j = 0; j < dataEx4a[i].length; j++)
                    		 {
                    			 System.out.print(dataEx4a[i][j] + " ");
                    		 }
                    		 System.out.println();
                    	 }
                         	
                    	System.out.println("Is magic square = " + exercise.isMagic(dataEx4a));
                    	int[][] dataEx4b = { { 8, 1, 6 }, { 3, 5, 7 },
                    			{ 4, 9, 2 } };
                    	 for (int i = 0; i < dataEx4b.length; i++)
                    	 {
                    		 for(int j = 0; j < dataEx4b[i].length; j++)
                    		 {
                    			 System.out.print(dataEx4b[i][j] + " ");
                    		 }
                    		 System.out.println();
                    	 }
                    	System.out.println("Is magic square = " + exercise.isMagic(dataEx4b));
                    	int[][] dataEx4c = { { 8, 1, 6 }, { 3, 5, 7 } };
                    	 for (int i = 0; i < dataEx4c.length; i++)
                    	 {
                    		 for(int j = 0; j < dataEx4c[i].length; j++)
                    		 {
                    			 System.out.print(dataEx4c[i][j] + " ");
                    		 }
                    		 System.out.println();
                    	 }
                    	System.out.println("Is magic square = " + exercise.isMagic(dataEx4c));
                    	break;
                    case '5':
                        int[][] dataEx5 = { { 3, 2, 5 }, { 1, 4, 4, 8, 13 },
                            { 9, 1, 0, 2 }, { 0, 2, 6, 3, -1, -8 } };
                        int[] maxMin = exercise.maxAndMinElements( dataEx5 );
                        System.out.print("Max and min elements = ");
                        for (int i = 0; i < maxMin.length; i++)
                        	System.out.print(maxMin[i] + " ");
                        System.out.println();
                        break;
                    case '6':
                        int[][] dataEx6 = { { 3, 2, 5 }, { 1, 4, 4, 8, 13 },
                            { 9, 1, 0, 2 }, { 0, 2, 6, 3, -1, -8 } };
                        int[] largestInRow = exercise.largestElements( dataEx6 );
                        System.out.print("Largest element in rows = ");
                        for (int i = 0; i < largestInRow.length; i++)
                        	System.out.print(largestInRow[i] + " ");
                        System.out.println();break;
                    case '7':
                        int[][] dataEx7 = { { 3, 2, 5 }, { 1, 4, 4, 8, 13 },
                            { 9, 1, 0, 2 }, { 0, 2, 6, 3, -1, -8 } };
                        exercise.reversalOfElementsInEachRow( dataEx7 );
                        break;
                    case '8':
                        int[][] imageEx8 = {
                            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 4, 4, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 4, 4, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
                        int[][] easySmooth = exercise.imageSmootherEasy( imageEx8 );
                        System.out.println("Before: ");
                        for (int i = 0; i < imageEx8.length; i++)
                        {
                        	for (int j = 0; j < imageEx8[i].length; j++)
                        		System.out.print(imageEx8[i][j] + " ");
                        	System.out.println();
                        }
                        System.out.println("After: ");
                        for (int i = 0; i < easySmooth.length; i++)
                        {
                        	for (int j = 0; j < easySmooth[i].length; j++)
                        		System.out.print(easySmooth[i][j] + " ");
                        	System.out.println();
                        }
                        break;
                    case '9':
                        int[][] imageEx9 = {
                            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 4, 4, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 4, 4, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };

                        int[][] hardSmooth = exercise.imageSmootherHard( imageEx9 );
                        System.out.println("Before: ");
                        for (int i = 0; i < imageEx9.length; i++)
                        {
                        	for (int j = 0; j < imageEx9[i].length; j++)
                        		System.out.print(imageEx9[i][j] + " ");
                        	System.out.println();
                        }
                        System.out.println("After: ");
                        for (int i = 0; i < hardSmooth.length; i++)
                        {
                        	for (int j = 0; j < hardSmooth[i].length; j++)
                        		System.out.print(hardSmooth[i][j] + " ");
                        	System.out.println();
                        }
                        break;
                    default:
                        if ( response.toLowerCase().charAt( 0 ) == 'q' )
                            done = true;
                        else
                            System.out.print( "Invalid Choice" );
                        break;
                }
            }
        } while ( !done );
        System.out.println( "Goodbye!" );
    }

}
