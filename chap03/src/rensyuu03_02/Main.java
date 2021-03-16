package rensyuu03_02;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int isHungry = 1;
		String food = "さくらんぼ";
			System.out.println("こんにちは");
		if (isHungry == 0) {
			System.out.println("お腹がいっぱいです");
		}else {
			System.out.println("はらぺこです");
			if (isHungry  != 0) {
				System.out.println(food + "をいただきます");
				System.out.println("ごちそうさまでした");
			}
		}
	}

}
