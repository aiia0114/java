package aa;

public class chapter3 {
	public static void main(String[] args) {
		 int weight = 33;
		if(weight > 30) {
			System.out.println("大きいね！");
		}
		for(int i = 1; i <= 10; i ++) {
			System.out.println(i);
		}
		for(int i = 1; i <= 10; i ++) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
