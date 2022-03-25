package exercicio1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		//Create a list of numbers
		List<Integer> numbers = Arrays.asList(9,4,1,2,3,0,8,5,6,7);
		
		//Creates an instance of Type Comparator using a Lambda expression
		Comparator<Integer> comparator = (obj1, obj2) -> -1 * obj1.compareTo(obj2);
		
		//Call the 'sort' method passing as a parameter a list of numbers and
		//an instance of 'Comparator'
		Collections.sort(numbers, comparator);
		
		//Iterate over the elements of the list using Method reference
		numbers.forEach(System.out::println);

	}

}
