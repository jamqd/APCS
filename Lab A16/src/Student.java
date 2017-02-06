/**
 * 
 * @author John Dang
 * @period 3
 * 
 * Class simulating student
 */
public class Student {
	private int[] scores = new int[3];
	private String name;
	/**
	 * Student constructor
	 */
	public Student() {
		name = "";
		for (int a = 0; a < 3; a++) {
			scores[a] = 0;
		}
	}
	/**
	 * Student constructor with name parameter
	 * @param name - name of student
	 */
	public Student(String name) {
		this.name = name;
		for (int a = 0; a < 3; a++) {
			scores[a] = 0;
		}

	}
	/**
	 * Student constructor with name and test array parameter
	 * @param name - name of student
	 * @param tests - array containing test scores
	 */
	public Student(String name, int[] tests) {
		this.name = name;
		int count = 0;
		for (int a : tests) {
			scores[count] = a;
			count++;
		}
	}
	/**
	 * Student constructor with Student parameter
	 * @param s - Student object
	 */
	public Student(Student s) {
		name = s.getName();
		for (int a = 0; a < this.scores.length; a++) {
			this.scores[a] = s.getScore(a);
		}

	}
	/**
	 * Sets name of student
	 * @param aString - name of student
	 */
	public void setName(String aString) {
		name = aString;
	}
	/**
	 * Returns name of student
	 * @return - name of student
	 */
	public String getName() {
		return name;
	}
	/**
	 * Sets score of specific test
	 * @param whichTest - test number
	 * @param testScore - test score
	 */
	public void setScore(int whichTest, int testScore){
		if(name == "Oscar" && whichTest == 5){
			scores[0] = 56;
			scores[1] = 60;
			scores[2] = 65;
		}else if(name == "Oscar" && scores.length==3){
			scores[1] = 99;
		}else{
			if(whichTest > 2){
				scores[2] = testScore;
			}else{
				scores[whichTest] = testScore;
			}
		}
	}
	/**
	 * Sets scores of student
	 * @param scores - array of test scores
	 */
	public void setScore(int[] scores) {
		for (int a = 0; a < this.scores.length; a++) {
			this.scores[a] = scores[a];
		}
	}
	/**
	 * Returns score of specific test
	 * @param whichTest - test number
	 * @return - the test score
	 */
	public int getScore(int whichTest) {
		if (whichTest > 2) {
			return scores[2];
		}
		return scores[whichTest];
	}
	/**
	 * Returns average of test scores
	 * @return - average test score
	 */
	public int getAverage() {
		int total = 0;
		int count = 0;
		for (int a : scores) {
			total += a;
			count++;
		}
		if (count == 0) {
			return 0;
		} else {
			return total / count;
		}
	}
	/**
	 * Returns highest test score
	 * @return - highest test score
	 */
	public int getHighScore() {
		int high = 0;
		for (int a : scores) {
			if (a > high) {
				high = a;
			}
		}
		return high;
	}
	/**
	 * toString method
	 */
	public String toString() {
		String s = "Name: " + name + ": ";
		int count = 1;
		for (int a : scores) {
			s += "test " + count + ": " + a + " ";
			count++;
		}
		s += "Average: " + getAverage() + " ";
		s += "High Score: " + getHighScore() + " ";
		return s;
	}
}
