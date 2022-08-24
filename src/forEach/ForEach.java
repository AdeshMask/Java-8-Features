package forEach;

import java.util.HashMap;
import java.util.Map;

public class ForEach {
	public static void main(String[] args) {
		Map<Integer, String> namesMap = new HashMap<>();
		namesMap.put(1, "Larry");
		namesMap.put(2, "Steve");
		namesMap.put(3, "James");
		System.out.println("Key Value");
		namesMap.forEach((key, value) -> System.out.println(key + "   " + value));
		System.out.println("Using method references:");
		
	}
}
