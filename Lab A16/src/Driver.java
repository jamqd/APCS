import java.util.ArrayList;

public class Driver {
	public static void main(String[] args){
		int[]b = new int[3];
		b[1] = 1;
		b[2] = 34;
		b[0] = 54;
		Student a = new Student("Bob", b);
		School c = new School();
		c.add(a);
		System.out.println(c);
		
	}
}
