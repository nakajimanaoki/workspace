package code03_19;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*for (int i = 1; i < 10; i++) {
			if (i == 3) {
				break;
			}
			System.out.println(i);
		}*/
		for (int i = 1; i < 10; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println(i);
		}
	}

}


/*break分の出力結果：1, 2
continue分の出力結果：1,2,4,5,6,7,8,9*/