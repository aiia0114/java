package aa;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class may19 {
	public static void main(String... args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(8);
		numbers.add(1);
		numbers.add(3);
		
		Collections.sort(numbers); // [1, 3, 8]と昇順に並び替え
		System.out.println(numbers);
		
		List<Integer> list = Arrays.asList(1, 2, 3);
		Collections.reverse(list);
		
		ArrayList<String> original = new ArrayList<>();
		original.add("apple");
		original.add("banana");
		
		ArrayList<String> copy = new ArrayList<>(original); // コピー
		copy.add("chery"); // コピーにだけ追加
		
		System.out.println(original);
		System.out.println(copy);
		
		// 演習問題1
		ArrayList<Integer> numbers2 = new ArrayList<>();
		numbers2.add(8);
		numbers2.add(1);
		numbers2.add(3);
		
		Collections.sort(numbers2);
		System.out.println(numbers2);
		
		// 演習問題2
		ArrayList<String> members = new ArrayList<>();
		members.add("kirishima");
		members.add("midorikawa");
		members.add("rokumura");
		
		ArrayList<String> members_copy = new ArrayList<>(members);
		members_copy.add("nara");
		
		System.out.println("members :" + members);
		System.out.println("members_copy :" + members_copy);
		
		//応用問題1
		ArrayList<String> fruits1 = new ArrayList<>();
		fruits1.add("apple");
		fruits1.add("banana");
		fruits1.add("orange");
		
		ArrayList<String> fruits2 = new ArrayList<>();
		fruits2.add("grape");
		fruits2.add("kiwi");
		fruits2.add("melon");
		
		fruits1.addAll(fruits2);
		System.out.println(fruits1);
		Collections.sort(fruits1);
		System.out.println(fruits1);
		
		// String と StringBuilder
		StringBuilder sd = new StringBuilder("Hello");
		sd.append(" World"); // 追加
		sd.insert(5, " Beautiful"); // 挿入
		System.out.println(sd);
		sd.delete(5, 15); // 削除
		System.out.println(sd);
		sd.replace(0, 5, "Hi"); // 置換
		System.out.println(sd);
		sd.reverse(); // 反転
		System.out.println(sd);
		sd.reverse(); // 元に戻す
		System.out.println(sd);
		sd.setCharAt(0, 'J'); // 文字変更
		System.out.println(sd);
		
		StringBuilder sd2 = new StringBuilder();
		sd2.append(" こんにちは");
		sd2.append("、 ");
		sd2.append("Javaの世界へようこそ!");
		System.out.println(sd2);
		System.out.println(sd2.toString());
		
		
	}

}