package rensyuu04_04;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] numbers = {3, 4, 9};
		System.out.println("１桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		for (int i = 0; i < numbers.length; i++ ) {
			if( numbers[i] == input) {
				System.out.println("あたり");
		}
	}
	}
}