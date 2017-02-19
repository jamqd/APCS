/**
 * 
 * @author John Dang
 * @period 3
 *
 */
public class GradeBook 
{
	private String courseName = "";
	private int[][] grades;
	/**
	 * Constructor initializes instance variables
	 * @param name - name of course
	 * @param gradesArray - array containing grades of each student
	 */
	public GradeBook(String name, int[][] gradesArray){
		courseName = name;
		grades = gradesArray;
	}
	/**
	 * Returns minimum test score
	 * @return - the minimum test score
	 */
	public int getMinimum(){
		int min = grades[0][0];
		for(int[]a: grades){
			for(int b: a){
				if(b < min){
					min = b;
				}
			}
		}
		return min;
	}
	/**
	 * Returnt he maximum test score
	 * @return - the maximum test score
	 */
	public int getMaximum(){
		int max = grades[0][0];
		for(int[]a: grades){
			for(int b: a){
				if(b>  max){
					max = b;
				}
			}
		}
		return max;
	}
	/**
	 * Returns the average test score
	 * @param setOfGrades - the array containing the test scores
	 * @return - the average test score
	 */
	public double getAverage(int[] setOfGrades){
		int sum = 0;
		int count = 0;
		for(int a: setOfGrades){
			sum += a;
			count++;
		}
		return (double) sum / count;
	}
	/**
	 * Prints bar chart of test score distribution
	 */
	public void outputBarChart(){
		System.out.println("Overall Grade Distribution");
		int[] count = new int[11];
		for(int [] a: grades){
			for(int b: a){
				count[b/10]++;
			}
		}
		for(int i = 0; i < count.length; i++){
			if(i == 10){
				System.out.printf("%5d: ", 100);
			}else{
				System.out.printf("%02d-%02d: ", i *10, i * 10 + 9);
			}
			for(int j = 0; j < count[i]; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	/**
	 * Prints table listing test scores and average of each student
	 */
	public void outputGrades(){
		System.out.println("The grades are:");
		System.out.println();
		System.out.print("               ");
		for(int i = 0; i < grades[0].length; i++){
			System.out.print("Test " + (i + 1) + "  ");
		}
		System.out.println("Average");
		for(int j = 0; j < grades.length; j++){
			System.out.printf("Student %2d", j + 1);
			for(int a: grades[j]){
				System.out.printf("%8d", a);
			}
			double avg = getAverage(grades[j]);
			System.out.printf("%9.2f", avg);
			System.out.println();
		}
	}
	/**
	 * Processes the grades
	 */
	public void processGrades(){
		System.out.println("Lowest grade is " + getMinimum());
		System.out.println("Highest grade is " +  getMaximum());
		System.out.println();
		outputGrades();
		outputBarChart();
	}
	/**
	 * Sets the course name
	 * @param name
	 */
	public void setCourseName(String name){
		courseName = name;
	}
	/**
	 * Returns the course name
	 * @return - the course name
	 */
	public String getCourseName(){
		return courseName;
	}
	/**
	 * Prints title message
	 */
	public void displayMessage(){
		System.out.println("Welcome to the gradebook for " + "\n" + courseName + "!");
		System.out.println();
		System.out.println();
	}
}// end class

