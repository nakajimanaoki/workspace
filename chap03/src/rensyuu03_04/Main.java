package rensyuu03_04;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("【数当てゲーム】");
		int ans = new java.util.Random().nextInt(10);
		for (ans = 1; ans < 5; ans++) {
			System.out.println("0～9の数字を入力してください");
			int num = new java.util.Scanner(System.in).nextInt();
			if (ans == num) {
				System.out.println("あたり");
				break;
			} else {
				System.out.println("はずれ");
			}
		}
		System.out.println("ゲームを終了します");
	}
}
