package functionalInterface;

/*
 * A functional interface is an interface that contains only one abstract method. 
 * They can have only one functionality to exhibit. From Java 8 onwards, 
 * lambda expressions can be used to represent the instance of a functional interface. 
 * A functional interface can have any number of default methods.
 * In Functional interfaces, there is no need to use the abstract keyword as it is 
 * optional to use the abstract keyword because, by default, 
 * the method defined inside the interface is abstract only. 
 * We can also call Lambda expressions as the instance of functional interface.
 */
public class FunctionalInterface {
	
	public static void main(String[] args) {
		int a = 5;
		/*
		 * lambda expression to define the calculate method
		 */
        Square s = (int x) -> x * x;
        /*
         * parameter passed and return type must be
         * same as defined in the prototype
         */ 
        int ans = s.calculate(a);
        System.out.println(ans);
	}
}
