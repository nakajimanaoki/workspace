package code14_02;

public class Main {

	public static void main(String[] args) {
		Hero h1 = new Hero();
		h1.name = "ミナト";
		h1.hp = 100;
		Hero h2 = new Hero();
		h2.name = "ミナト";
		h2.hp = 100;
		if (h1.equals(h2) == true) {
			System.out.println("同じです");
		}else {
			System.out.println("違います");
		}
	}

}
