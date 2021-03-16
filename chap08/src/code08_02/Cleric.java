package code08_02;

public class Cleric {
	String name;
	int hp = 50;
	final int HP = 50;
	int mp = 10;
	final int MP = 10;

	public void selfAid() {
		this.mp -= 5;
		System.out.println(this.name + "はセルフエイドを使った！");
		System.out.println("HPが全回復した！");
	}
//	public int pray(int sec) {
//		this.mp += sec;
//		int g = new java.util.Random().nextInt(3) + sec;
//
//		System.out.println(this.name + "は" + sec + "秒祈った！");
//
//		if(g + this.mp <= 10) {
//		System.out.println("MPが" + g +  "ポイント回復した！" );
//		}else if (g + this.mp > 10) {
//			System.out.println("MPが全回復した！");
//			return g;
//		}
//	}
//	}

	public int pray(int sec) {
		int recover = sec + new java.util.Random().nextInt(3);
		int recoverActual = Math.min(this.MP - this.mp, recover);

		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した！");
		return recoverActual;
	}
	}