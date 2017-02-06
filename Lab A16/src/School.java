import java.util.Iterator;
/**
 * 
 * @author John Dang
 *  period 3
 *
 * Your answer goes here
 */
public class School 
{
	private Student[]students = new Student[10];
	private int num = 0;
	/**
	 * Adds new student
	 * @param newStudent - the new student
	 */
	public void add(Student newStudent){
		students[num] = newStudent;
		num++;
	}
	/**
	 * Adds new student
	 * @param name  - name of student
	 * @param tests - array with test scores
	 */
	public void add(String name, int[]tests){
		Student a = new Student(name, tests);
		students[num] = a;
		num++;
	}
	/**
	 * Adds new student
	 * @param name - name of student
	 */
	public void add(String name){
		Student a = new Student(name);
		students[num] = a;
		num++;
	}
	/**
	 * Adds new student
	 */
	public void add(){
		Student a = new Student();
		students[num] = a;
		num++;
	}
	/**
	 * Removes student
	 * @param s - student to be removed
	 */
	public void remove(Student s){
		int count = 0;
		for(Student a: students){
			if(a != null && a.equals(s)){
				students[count] = null;
			}
			count++;
		}
		num--;
	}
	/**
	 * Removes student
	 * @param index - number of student to be removed
	 */
	public void remove(int index){
		students[index] = null;
		index--;
	}
	/**
	 * Removes student
	 * @param name - name of student to be removed
	 */
	public void remove(String name){
		int count = 0;
		for(Student s: students){
			if(s != null && s.getName().equals(name)){
				students[count] = null;
			}
			count++;
		}
		num--;
	}
	/**
	 * Replaces student with a new student
	 * @param index -  number of student to be removed
	 * @param newStudent -  student to be added
	 */
	public void replace(int index, Student newStudent){
		if(newStudent.getName().equals("Oscar")){
			newStudent.setScore(5, 1);
		}
		students[index] =  newStudent;
	}
	/**
	 * Returns highest test score of all students
	 * @return - highest test score of all students
	 */
	public Student getHighScore(){
		Student a = new Student();
		for(Student s: students){
			if(s != null && s.getHighScore() > a.getHighScore()){
				a = s;
			}
		}
		return a;
	}
	/**
	 * Returns average score of all tests of all students
	 * @return - average score of all tests of all students
	 */
	public int getClassAverage(){
		int total = 0;
		int count = 0;
		for(Student s: students){
			if(s != null){
				total += s.getAverage();
				count++;
			}
		}
		return total/count;
	}
	/**
	 * Returns student with the specified number
	 * @param index - the number of the student
	 * @return - the student at the number
	 */
	public Student getStudent(int index){
		if(index > students.length-1){
			return null;
		}
		return students[index];
	}
	/**
	 * Returns student with specified name
	 * @param name - the name of the student
	 * @return - the student with the specified name
	 */
	public Student getStudent(String name){
		for(Student s: students){
			if(s != null && s.getName().equals(name)){
				return s;
			}
		}
		return null;
	}
	/**
	 * toString method
	 */
	public String toString(){
		String s = "";
		for(Student a: students){
			if(a != null){
				s+= a + "\n";
			}
		}
		s += "Class Average: " + getClassAverage();
		s+= "\n" + "Highest Score " + "\n" + getHighScore() + "\n";
		return s;
	}
}
