package exercicio3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Application3 {

	public static void main(String[] args) {
		
		//Create a list of Strings
		List<String> listStrings = Arrays.asList("Java","eclipse","Developer");
		//Create a list of Doubles
		List<Double> listDoubles= Arrays.asList(1.123, 23.45, 6.98, 45.98, 34.90);
		
		//Instantiates a 'Function' that passes a String as a parameter and returns this String in Uppercase
		Function<String,String> function1 = x -> x.toUpperCase();
		//Instantiates a 'Function' that passes a Double as a parameter and returns that Double with the value rounded down
		Function<Double,Double> function2 = x -> Math.floor(x);
		
		//Creates two lists that receive the result of calls to the static method 'transform'
		List<String> returnFunction1 = transform(listStrings,function1);
		List<Double> returnFunction2 = transform(listDoubles,function2);	
		
		System.out.println("--- ReturnFunction1 List Elements ---");
		//Iterate over the elements of the list using Method reference
		returnFunction1.forEach(System.out::println);
		
		System.out.println();
		System.out.println("--- ReturnFunction2 List Elements ---");
		//Iterate over the elements of the list using Method reference
		returnFunction2.forEach(System.out::println);

	}
	
	//Method that receives a parameterized List and a parameterized Function instance as a parameter
	public static <T> List<T> transform(List<T> list, Function<T, T> function) {

		// Creates a parameterized List that will be returned at the end of the method
		List<T> returnList = new ArrayList<>();

		// Iterates over the elements of the list passed as a parameter
		for (T l : list) {

			// Calls the 'add' method of the list created in the method that receives as a
			// parameter the result of the call to the 'apply' method of the 'Function' instance also
			// passed as a parameter
			returnList.add(function.apply(l));
		}

		// Returns the list created in the method
		return returnList;
	}

}
