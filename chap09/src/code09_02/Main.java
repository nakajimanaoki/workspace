package code09_02;

public class Main {

	public static void main(String[] args) {
		Hero h1 = new Hero("ミナト");

		System.out.println(h1.name + h1.hp);

		Hero h2 = new Hero();

		System.out.println(h2.name);
		h2.attack();
	}

}
