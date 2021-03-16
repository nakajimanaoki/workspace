package code03_08;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("passwordを入力してください。");
        String pass = new java.util.Scanner(System.in).nextLine();
        System.out.println("passwordを確認します");
        String comf = new java.util.Scanner(System.in).nextLine();
        if(pass.equals(comf)) {
        	System.out.println("登録しました");
        }else {
        	System.out.println("passwordが異なります");
        }
	}

}
