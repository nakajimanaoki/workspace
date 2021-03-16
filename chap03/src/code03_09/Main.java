package code03_09;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("数字を入力してください。");
		int A = new java.util.Scanner(System.in).nextInt();
		int a = new java.util.Random().nextInt(7);
		a++;
		if (A == a) {
			System.out.println("ビンゴ");
		} else {
			System.out.println("はずれ");
		}
	}

}
