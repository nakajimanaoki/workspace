package code02_17;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        System.out.println("ようこそ占いの館へ");
        System.out.println("あなたの名前を入力してください。");
        String name = new java.util.Scanner(System.in).nextLine();
        System.out.println("あなたの年齢を入力してください。");
        String ageString = new java.util.Scanner(System.in).nextLine();
        int age = Integer.parseInt(ageString);
        int fortune = new java.util.Random().nextInt(4);
        int n = fortune;
        int x = n+=1;
        System.out.println("占いの結果がでました");
        while(x==1){
            System.out.println(age + "歳の" + name + "さん、あなたの運気は大吉です");
            break;
        }
        while(x==2){
            System.out.println(age + "歳の" + name + "さん、あなたの運気は中吉です");
            break;
        }
        while(x==3){
            System.out.println(age + "歳の" + name + "さん、あなたの運気は吉です");
            break;
        }
        while(x==4){
            System.out.println(age + "歳の" + name + "さん、あなたの運は凶です");
            break;
        }
	}

}
