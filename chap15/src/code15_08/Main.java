package code15_08;

public class Main {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10000; i++) {
			sb.append("Java");
		}
		String s = sb.toString();

		long end = System.currentTimeMillis();
		System.out.println("処理にかかった時間は..." + (end - start) + "ミリ秒でした");
		start = System.currentTimeMillis();

		s = s + "Java";
	end = System.currentTimeMillis();
	long end2 = end - start;
	System.out.println("+演算子で処理にかかった時間は..." + end2 + "ミリ秒でした");
	System.out.println("+演算子で処理にかかった時間は...StringBuilderde 処理にかかった時間の...\n" + (end2/end) + "倍でした");;
}
}