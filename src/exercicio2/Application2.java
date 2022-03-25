package exercicio2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Application2 {

	public static void main(String[] args) {
		
		//Create a list of Integers
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		//Instantiates a 'Function' that passes a value as a parameter and returns twice that value
		Function<Integer,Integer> function1 = x -> x * 2;
		//Instantiates a 'Function' that passes the value as a parameter and returns that value with the sign inverted
		Function<Integer,Integer> function2 = x -> -x;
		
		//Creates two lists of Integers that receive the result of calls to the static method 'Transform'
		List<Integer> returnFunction1 = transform(list,function1);
		List<Integer> returnFunction2 = transform(list,function2);	
		
		System.out.println("--- ReturnFunction1 List Elements ---");
		//Iterate over the elements of the list using Method reference
		returnFunction1.forEach(System.out::println);
		
		System.out.println();
		System.out.println("--- ReturnFunction2 List Elements ---");
		//Iterate over the elements of the list using Method reference
		returnFunction2.forEach(System.out::println);
	}
	
	//Method that takes as a parameter a list of integers and an instance of Function
	public static List<Integer> transform(List<Integer> list, Function<Integer,Integer> function){
		
		//Creates a list of integers that will be returned at the end of the method
		List<Integer> returnList = new ArrayList<>();
		
		//Iterates over the elements of the list passed as a parameter
		for(Integer l: list) {
			
			//Calls the 'add' method of the list created in the method that receives as a parameter the
			//result of the call to the 'apply' method of the 'Function' instance also passed as a parameter
			returnList.add(function.apply(l));
		}
		
		//Returns the list created in the method
		return returnList;
	}

}
