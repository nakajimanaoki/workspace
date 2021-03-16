package code08_03;

public class Car {
	int fuel;
	int speed;

	public void accelarate(int km) {
		this.speed += km;
		System.out.println("速度は" + this.speed );
	}

	public int run(int hour) {
		int distance = this.speed * hour;
		this.fuel -= distance;
		System.out.println(distance + "Km走行しました");
		return distance;
	}
	public void stop() {
		this.speed = 0;
		System.out.println("停車しました！");
	}
	public void showMeter() {
		System.out.println("時速は" + this.speed );
		System.out.println("燃料の残りは" + this.fuel);
	}
}
