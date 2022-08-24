package lambdaExpression;

import java.util.function.Function;
import java.util.function.Predicate;

/*
 * Lambda Expression is an Java 8 feature.
 * Because of lambda expression code reduced.
 * Because of lambda Expression in java Enabled functional programming.
 * lambda Expression reduce the code size.
 * function from the lambda we can handle just like object.
 */
public class LambdaExpression {

	public static void main(String[] args) {
		System.out.println("Welcome to Lambda Expression Java 8 Feature...");
		/*
		 * By using lambda expression performing multiplication.
		 * By using apply() lambda functionality is working.
		 */
		Function<Integer,Integer> f = i-> i * i;
		System.out.println(f.apply(5));
		/*
		 * By using Predicate checking the number is even or not.
		 */
		System.out.println("Checking the given number is even or odd");
		Predicate<Integer> p= i -> i % 2==0;
		System.out.println(p.test(1));
	}
}
