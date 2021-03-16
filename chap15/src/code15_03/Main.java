package code15_03;

public class Main {

	public static void main(String[] args) {
		String s1 = "Java programming";
		String a = "Sampl";
		System.out.println("文字列s1の4文字目以降は" + s1.substring(3));
		System.out.println("文字列s1の4～8文字目は" + s1.substring(3, 8));
		System.out.println("小文字に変えました" + a.toLowerCase());
		System.out.println("大文字に変えました" + a.toUpperCase());
		System.out.println(s1.trim());
		System.out.println(a.replace('S','s'));
	}

}
