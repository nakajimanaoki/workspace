package code09_01;

public class Hero {
	String name;
	int hp;
	Sword sword;
	public void attack() {
		System.out.println(this.name + "は攻撃をした");
		System.out.println("敵に" + this.sword.damage + "のダメージを与えた！！");
	}
}
