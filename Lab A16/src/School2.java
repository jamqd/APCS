import java.util.ArrayList;

/**
 * 
 * @author John Dang
 *  period 3
 *
 * Your answer goes here
 */
public class School2
{
	private ArrayList<Student2>students = new ArrayList<Student2>();
	public void add(Student2 newStudent){
		students.add(newStudent);
	}
	public void add(String name, ArrayList<Integer>tests){
		Student2 a = new Student2(name, tests);
		students.add(a);
	}
	public void add(String name){
		Student2 a = new Student2(name);
		students.add(a);
	}
	public void add(){
		Student2 a = new Student2();
		students.add(a);
	}
	public void remove(Student2 s){
		students.remove(s);
	}
	public void remove(int index){
		students.remove(index);
	}
	public void remove(String name){
		for(Student2 s: students){
			if(s.getName().equals(name)){
				students.remove(s);
			}
		}
	}
	public void replace(int index, Student2 newStudent){
		students.set(index, newStudent);
	}
	public Student2 getHighScore(){
		Student2 a = new Student2();
		int high = 0;
		for(Student2 s: students){
			if(s.getHighScore() > high){
				a = s;
			}
		}
		return a;
	}
	public int getClassAverage(){
		int total = 0;
		int count = 0;
		for(Student2 s: students){
			total += s.getAverage();
			count++;
		}
		return total/count;
	}
	public Student2 getStudent(int index){
		return students.get(index);
	}
	public Student2 getStudent(String name){
		Student2 a = new Student2();
		for(Student2 s: students){
			if(s.getName().equals(name)){
				a = s;
			}
		}
		return a;
	}
	public String toString(){
		String s = "";
		for(Student2 a: students){
			s+= a;
		}
		s += getClassAverage();
		s+= getHighScore();
		return s;
	}
}
