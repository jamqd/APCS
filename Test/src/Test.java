import java.util.ArrayList;

public class Test {
	private ArrayList <String> roster = new ArrayList <String> ();
	
	public void addPlayer(String name){
		roster.add(name);
	}
	
	public void removePlayer(int num){
		roster.remove(num);
	}
	
	public int getRosterSize(){
		return roster.size();
	}
	
	public void printRoster(){
		int count = 0;
		for(String name: roster){
			System.out.println(count + name);
			count++;
		}
	}
}
