package code03_12;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("あなたの運勢を占います");
		int fortune = 1;
		switch (fortune) {
		case 1:
			System.out.println("大吉");
		case 2:
			System.out.println("中吉");
			break;
		case 3:
			System.out.println("吉");
			break;
		default:
			System.out.println("凶");
		}
	}
}

/*11行目の下にbreakを記述し忘れているので、出力結果は"大吉"と"中吉"*/