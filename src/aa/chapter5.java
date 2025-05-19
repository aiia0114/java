package aa;

import java.util.ArrayList;

public class chapter5 {
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add(1, "banana");
		fruits.add(2, "greap");
		
		String firstFruits = fruits.get(1);
		System.out.println(firstFruits);
		
		fruits.set(0, "melon");
		
		int count = fruits.size();
		
		if(count > 0) {
			fruits.clear();
		}
		System.out.println(count);
		
		// インスタンス化
		// 演習1
		Player player = new Player();
		
		String language = "java";
		
		Integer  value = 42;
		
		ArrayList<String> items = new ArrayList<>();
		
		System.out.println("プレイヤーを作成しました");
		System.out.println("使用言語:" + language);
		System.out.println("値:" + value);
		System.out.println("アイテム数:" + items.size());
	}
	
	class Player() {
		
	}
	public static void greet(String message) {
		System.out.println(message);
		
		
	}
}