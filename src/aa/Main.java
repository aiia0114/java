package aa;
import java.util.ArrayList;

public class Main {
	public static void main(String... args) {
		System.out.println("11まで進めてたので12からやってます");
		Integer i = 5;
		if (i == 5) {
			System.out.println("iは5");
		}
		
		
		if (i == 3) {
			System.out.println("iは3");
		}else {
			System.out.println("iは3ではない");
		}
		
		if (i == 1) {
            System.out.println("1位です");
        } else if (i == 2){
            System.out.println("2位です");
        } else {
        	System.out.println("最下位です");
        }
		
		ArrayList<Integer> socres = new ArrayList<>();
		socres.add(30);
		socres.add(70);
		socres.add(90);
		socres.add(69);
		socres.forEach(score -> {
			if (score >= 70) {
				System.out.println("合格");
			}else {
				System.out.println("不合格");
				}
		});
	}
}
