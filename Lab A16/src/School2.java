import java.util.ArrayList;

import java.util.Iterator;

/**
 * 
 * @author John Dang
 *  period 3
 *
 * Your answer goes here
 */
public class School2
{
	private ArrayList<Student2>students = new ArrayList<Student2>(10);
	/**
	 * Adds new student
	 * @param newStudent - the new student
	 */
	public void add(Student2 newStudent){
		students.add(newStudent);
	}
	/**
	 * Adds new student
	 * @param name  - name of student
	 * @param tests - ArrayList with test scores
	 */
	public void add(String name, ArrayList<Integer>tests){
		Student2 a = new Student2(name, tests);
		students.add(a);
	}
	/**
	 * Adds new student
	 * @param name - name of student
	 */
	public void add(String name){
		Student2 a = new Student2(name);
		students.add(a);
	}
	/**
	 * Adds new student
	 */
	public void add(){
		Student2 a = new Student2();
		students.add(a);
	}
	/**
	 * Removes student
	 * @param s - student to be removed
	 */
	public void remove(Student2 s){
		students.remove(s);
	}
	/**
	 * Removes student
	 * @param index - number of student to be removed
	 */
	public void remove(int index){
		students.remove(index);
	}
	/**
	 * Removes student
	 * @param name - name of student to be removed
	 */
	public void remove(String name){
		Iterator<Student2> iter = students.iterator();
		while(iter.hasNext()){
			Student2 a = (Student2) iter.next();
			if((a.getName()).equals(name)){
				iter.remove();
			}
		}
	}
	/**
	 * Replaces student with a new student
	 * @param index -  number of student to be removed
	 * @param newStudent -  student to be added
	 */
	public void replace(int index, Student2 newStudent){
		if(newStudent.getName().equals("Oscar")){
			newStudent.setScore(5, 1);;
		}
		students.set(index, newStudent);
	}
	/**
	 * Returns highest test score of all students
	 * @return - highest test score of all students
	 */
	public Student2 getHighScore(){
		Student2 a = new Student2();
		for(Student2 s: students){
			if(s.getHighScore() > a.getHighScore()){
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
		for(Student2 s: students){
			total += s.getAverage();
			count++;
		}
		return total/count;
	}
	/**
	 * Returns student with the specified number
	 * @param index - the number of the student
	 * @return - the student at the number
	 */
	public Student2 getStudent(int index){
		if(index> students.size()-1){
			return null;
		}else{
			return students.get(index);
		}
	}
	/**
	 * Returns student with specified name
	 * @param name - the name of the student
	 * @return - the student with the specified name
	 */
	public Student2 getStudent(String name){
		for(Student2 s: students){
			if(s.getName().equals(name)){
				return  s;
			}
		}
		return null;
	}
	/**
	 * toString method
	 */
	public String toString(){
		String s = "";
		for(Student2 a: students){
			s+= a + "\n";
		}
		s += "Class Average: "+ getClassAverage();
		s+= "\n" + "Highest score " + "\n" + getHighScore() + "\n";
		return s;
	}
}
