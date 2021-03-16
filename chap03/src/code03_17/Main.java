package code03_17;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "回");
		}
		for (int i = 0; i < 10; i += 2) {
			System.out.println(i + "キログラム");
		}
		for (int i = 10; i > 0; i--) {
			System.out.println(i + "回");
		}
		int i = 0;
		for (; i < 10; i++) {
			System.out.println(i + "回");
		}
		for (int i = 0; i < 10;) {
			i++;
			System.out.println(i + "回");
		}
	}

}
