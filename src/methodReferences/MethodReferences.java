package methodReferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Method Reference is the Java 8 feature.
 * By using this feature we can take the reference of another class.
 * In this code we are taking the reference of Cars class for he name and price.
 */
public class MethodReferences {
	public static int compareByName(Cars a, Cars b)
    {
        return a.getName().compareTo(b.getName());
    }
	
	public static void main(String[] args) {
		List<Cars> cars = new ArrayList<>();
		cars.add(new Cars("Rolls Royce",90000000));
		cars.add(new Cars("Lamborgine",32200000));
		cars.add(new Cars("Mercedies",4500000));
		cars.add(new Cars("Jaguar",4700000));
		/*
		 * By using forEach we are iterating all the list values.
		 */
		cars.forEach(System.out::println);
		/*
		 * Here we are sorting the cars by its name.
		 * for that we used collection and its libraries.
		 */
		System.out.println("Sorting cars by Name:");
		/*
		 * From  here we are calling default method sort from Collection.
		 */
		Collections.sort(cars,MethodReferences::compareByName);
		/*
		 * Form the Java 8 feature we are using stream.
		 * Stream is not an data structure it return sequence, means by using stream
		 * we can use the default libraries of Collection 
		 * this is the pipeline to produce desired result. 
		 */
		cars.stream().map(x -> x.getName()).forEach(System.out::println);	
	}
}
