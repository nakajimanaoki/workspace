package code10_03;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.hp = 100;

		PoisonMatango pm = new PoisonMatango('A');
		pm.attack(h);

	}

}
