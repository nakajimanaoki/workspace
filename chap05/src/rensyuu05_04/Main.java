package rensyuu05_04;

public class Main {
	public static void main(String[] args) {
		email("明日の件", "naoki@gamil.com", "明日は休みです");
		email("naoki@gamil.com", "明日は休みです");
	}
		public static void email(String title, String address, String text) {
			System.out.println(address + "に以下のメールを送信しました。"  );
			System.out.println("件名：" + title);
			System.out.println("本文：" + text);
		}
		public static void email(String address, String text) {
			System.out.println(address + "に以下のメールを送信しました。"  );
			System.out.println("件名：無題");
			System.out.println("本文：" + text);
		}
	}

