package rensyuu05_03;

public class Main {
	public static void main(String[] args) {
	email("明日の件", "naoki@gamil.com", "明日は休みです");
}
	                           /* 受け取る側は型が解らないと受け取りたくないので型宣言してあげる*/
	public static void email(String title, String address, String text) {
		System.out.println(title + "に以下のメールを送信しました。"  );
		System.out.println(address);
		System.out.println(text);
	}
}

/*下記の書き方が現場では好ましい
public static void main(String[] args) {
	String title = "明日の件";
	String address = "naoki@gamil.com";
	String text = "明日は休みです";
	email(title, address, text);
}*/