/**
 * 
 * @author John Dang
 * @period 3
 *
 */
public class Student 
{
	private int[]scores = new int[3];
	private String name;
	public Student(){
		name = "";
		for(int a = 0; a<scores.length; a++){
			scores[a] = 0;
		}
	}
	public Student(String name){
		this.name = name;
		for(int a = 0; a<scores.length; a++){
			scores[a] = 0;
		}
		
	}
	public Student(String name, int[] scores){
		this.name = name;
		for(int a = 0; a<this.scores.length; a++){
			this.scores[a] = scores[a];
		}
	}
	public Student(Student s){
		name = s.getName();
		for(int a = 0; a<this.scores.length; a++){
			this.scores[a] = s.getScore(a);
		}
		
	}
	public void setName(String aString){
		name = aString;
	}
	public String getName(){
		return name;
	}
	public void setScore(int whichTest, int testScore){
		scores[whichTest] = testScore;
	}
	public void setScore(int[] scores){
		for(int a = 0; a<this.scores.length; a++){
			this.scores[a] = scores[a];
		}
	}
	public int getScore(int whichTest){
		return scores[whichTest];
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
