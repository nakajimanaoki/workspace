package code13_02;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();

		h.setName("ミナト");
		h.setHp(999);

		System.out.println("勇者" + h.getName() + "誕生");

		Wizard w = new Wizard();

		w.setName("アサカ");
		w.setHp(10);
		w.setMp(999);

		System.out.println("魔法使い" + w.getName() + "誕生");

		Wand wand = new Wand();

		wand.setName("ポッター");
		wand.setPower(10);

		w.heal(h);
	}

}
