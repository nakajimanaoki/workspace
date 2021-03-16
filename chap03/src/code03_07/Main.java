package code03_07;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
      int a = new java.util.Random().nextInt(7);
      a++;
      int b = new java.util.Random().nextInt(7);
      b++;
     int 〇 = a;
     int B = b;
      while(〇 > B) {
    	  System.out.println("〇の勝ちです");
    	  break;
      }
      while(〇 < B) {
    	  System.out.println("Bの勝ちです");
    	  break;
      }
      while(〇 == B) {
    	  System.out.println("引き分けです");
    	  break;
      }
	}

}
