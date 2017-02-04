import java.util.ArrayList; //imports ArrayList class

public class Test { //declares Test class

	//method returns list parameter in reverse
	public static int[] method1(int[] list) { //declares array-returning static method with array parameter
		int[] result = new int[list.length]; //creates list with the same length of array parameter
		for (int i = 0, j = result.length - 1; i < list.length; i++, j--) { // Declares for loop
			result[j] = list[i]; //Sets element of list array to element of the result array
		}
		return result; //returns the reversed array
	}
	//method prints items in array
	public static void method2(int [] list){ //declares static method with array parameter
		for(int n: method1(list)){ //declares for each loop that iterates through the array
			System.out.println(n); //prints each element of the array
		}
	}
}
