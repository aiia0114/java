package aa;
import java.util.Scanner;

public class chapter4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	System.out.println("1~10から数字を入力してください:");
		var num = scanner.nextLine();
		
		switch(num) {
		case"3":
			System.out.println("アタリ！");
			break;
		case"4":
			System.out.println("アタリ!");
			break;
		case"9":
			System.out.println("アタリ!");
			break;
		default:
			System.out.println("ハズレ!");
			break;
		}
		}
	}