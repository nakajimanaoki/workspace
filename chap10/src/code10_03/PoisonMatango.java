package code10_03;

public class PoisonMatango extends Matango{
	int pa = 5;
	public PoisonMatango(char suffix) {
		super(suffix);
	}
	public void attack(Hero h) {
		super.attack(h);

		if(pa > 0) {
			System.out.println("さらに毒の胞子をばらまいた");
			int damage = h.hp/5;
			h.hp -= damage;
			System.out.println( damage +  "ポイントのダメージ");
			this.pa -= 1;
		}
	}
}
