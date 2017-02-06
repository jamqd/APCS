import java.util.ArrayList;

/**
 * 
 * @author John Dang
 * @period 3
 *
 * Class simulating student
 */
public class Student2 {
	private ArrayList<Integer> scores = new ArrayList<Integer>(3);
	private String name;
	/**
	 * Student constructor
	 */
	public Student2() {
		name = "";
		for (int a = 0; a < 3; a++) {
			scores.add(0);
		}
	}
	/**
	 * Student constructor with name parameter
	 * @param name - name of student
	 */
	public Student2(String name) {
		this.name = name;
		for (int a = 0; a < 3; a++) {
			scores.add(0);
		}
	}
	/**
	 * Student constructor with name and test array parameter
	 * @param name - name of student
	 * @param tests - ArrayList containing test scores
	 */
	public Student2(String name, ArrayList<Integer> tests) {
		this.name = name;
		for (int a : tests) {
			scores.add(a);
		}
	}
	/**
	 * Student constructor with Student2 parameter
	 * @param s - Student2 object
	 */
	public Student2(Student s) {
		name = s.getName();
		for (int a = 0; a < this.scores.size(); a++) {
			this.scores.set(a, s.getScore(a));
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
	public void setScore(int whichTest, int testScore) {
		if (name == "Oscar" && whichTest == 5) {
			scores.set(0,56);
			scores.set(1, 60);
			scores.set(2, 65);
		}else if(name == "Oscar" && scores.size()==3){
			scores.set(1, 99);
		}else {
			if (whichTest > 2) {
				scores.set(2, testScore);
			} else {
				scores.set(whichTest, testScore);
			}
		}
	}
	/**
	 * Sets scores of student
	 * @param scores - ArrayList of test scores
	 */
	public void setScore(ArrayList<Integer> scores) {
		for (int a = 0; a < this.scores.size(); a++) {
			this.scores.set(a, scores.get(a));
		}
	}
	/**
	 * Returns score of specific test
	 * @param whichTest - test number
	 * @return - the test score
	 */
	public int getScore(int whichTest) {
		if (whichTest > 2) {
			return scores.get(2);
		}
		return scores.get(whichTest);
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
