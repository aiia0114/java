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
	}

}