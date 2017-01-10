
public class Driver {
	public static void main(String[] args){
		StopWordRemover test = new StopWordRemover("test.txt", "output.txt", 30);
		test.removeStopWords();
	}
}
