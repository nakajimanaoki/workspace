package code03_06;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        int a = 200000;
        int b = 4;
        while(a >= 50000) {
        	System.out.println(b + "月の所持金" + a);
        	a-=100000;
        	b++;
        while(a==0) {
        	System.out.println(b + "月の所持金" + a + "あああああ。。。");
        	a+=150000;
        	b++;
        }
        }
	}

}
