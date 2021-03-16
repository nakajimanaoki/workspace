package code09_02;

public class Hero {
	String name;
	int hp;

	public void attack() {
		System.out.println(this.name + "は攻撃をした");
		System.out.println("敵に" + 10 + "のダメージを与えた！！");
	}
	public Hero(String name) {
		this.hp = 100;
		this.name = name;
	}
	public Hero() {
		this( "ダミー");
	}

}
