package code03_05;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        int a = 50000;
        int b = 4;
        while(a <= 250000) {
        	System.out.println(b + "月の給料は" + a);
        	a+=50000;
        	b++;
        }
	}

}
