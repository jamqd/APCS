import java.util.Random; //imports Random class

public class TesterDriver { //declares TesterDriver class
	//method creates list of 10 random integers and prints them in reverse order
	public static void main(String[] args){ //declares main method
		int[] list = new int[10]; //creates array of size 10
		Random rand = new Random(); //creates Random object
		for(int i = 0; i<=9; i++){ //declares for loop
			list[i] = rand.nextInt(); //sets each element in the list to a random number
		}
		Test.method2(list); //prints random array in reverse order
	}
}
