package aa;

import java.util.ArrayList;

public class chapter5 {
	public static void greet(String message) {
		System.out.println(message);
		
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add(1, "banana");
		fruits.add(2, "greap");
		
		String firstFruits = fruits.get(1);
		System.out.println(firstFruits);
		
		fruits.set(0, "melon");
		
		int count = fruits.size();
		
		System.out.println(count);
	}
}