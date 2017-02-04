
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
	private int index = 0;
	public void add(Student newStudent){
		students[index] = newStudent;
		index++;
	}
	public void add(String name, int[]tests){
		Student a = new Student(name, tests);
		students[index] = a;
		index++;
	}
	public void add(String name){
		Student a = new Student(name);
		students[index] = a;
		index++;
	}
	public void add(){
		Student a = new Student();
		students[index] = a;
		index++;
	}
	public void remove(Student s){
		/*
		students.remove(s);
		*/
	}
	public void remove(int index){
		students[index] = null;
	}
	public void remove(String name){
		/*
		for(Student s: students){
			if(s.getName().equals(name)){
				students.remove(s);
			}
		}
		*/
	}
	public void replace(int index, Student newStudent){
		students[index] =  newStudent;
	}
	public Student getHighScore(){
		Student a = new Student();
		int high = 0;
		for(Student s: students){
			if(s.getHighScore() > high){
				a = s;
			}
		}
		return a;
	}
	public int getClassAverage(){
		int total = 0;
		int count = 0;
		for(Student s: students){
			total += s.getAverage();
			count++;
		}
		return total/count;
	}
	public Student getStudent(int index){
		return students[index];
	}
	public Student getStudent(String name){
		Student a = new Student();
		for(Student s: students){
			if(s.getName().equals(name)){
				a = s;
			}
		}
		return a;
	}
	public String toString(){
		String s = "";
		for(Student a: students){
			s+= a;
		}
		s += getClassAverage();
		s+= getHighScore();
		return s;
	}
}
