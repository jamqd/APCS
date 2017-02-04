import java.util.ArrayList;

/**
 * 
 * @author John Dang
 * @period 3
 *
 */
public class Student2
{
	private ArrayList<Integer>scores = new ArrayList<Integer>();
	private String name;
	public Student2(){
		name = "";
		for(int a = 0; a<scores.size(); a++){
			scores.set(a, 0);
		}
	}
	public Student2(String name){
		this.name = name;
		for(int a = 0; a<scores.size(); a++){
			scores.set(a, 0);
		}
		
	}
	public Student2(String name, ArrayList<Integer>scores){
		this.name = name;
		for(int a = 0; a<this.scores.size(); a++){
			this.scores.set(a, scores.get(a));
		}
	}
	public Student2(Student s){
		name = s.getName();
		for(int a = 0; a<this.scores.size(); a++){
			this.scores.set(a, s.getScore(a));
		}
		
	}
	public void setName(String aString){
		name = aString;
	}
	public String getName(){
		return name;
	}
	public void setScore(int whichTest, int testScore){
		scores.set(whichTest, testScore);
	}
	public void setScore(ArrayList<Integer>scores){
		for(int a = 0; a<this.scores.size(); a++){
			this.scores.set(a, scores.get(a));
		}
	}
	public int getScore(int whichTest){
		return scores.get(whichTest);
	}
	public int getAverage(){
		int total = 0;
		int count = 0;
		for(int a: scores){
			total+= a;
			count++;
		}
		if(count == 0){
			return 0;
		}else{
			return total/count;
		}
	}
	public int getHighScore(){
		int high = 0;
		for(int a: scores){
			if(a> high){
				a = high;
			}
		}
		return high;
	}
	public String toString(){
		String s = "Name: " + name + " ";
		int count  = 1;
		for(int a: scores){
			s+=  "test " + "count" + ": " +  a + " ";
			count ++;
		}
		s+= "Average: " + getAverage() + " ";
		s+= "High Score" + getHighScore() + " ";
		String test = scores.toString();
		return test;
	}
}
