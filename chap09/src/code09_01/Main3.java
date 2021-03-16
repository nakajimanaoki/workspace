package code09_01;

public class Main3 {

	public static void main(String[] args) {
		String s = "こんにちは";
		String a = "こんにち";
		System.out.println(s);
		if(s == a) {
			System.out.println("true");
		}else{
			System.out.println(false);
		}
	}

}

//[ == ]はアドレスを比較している
