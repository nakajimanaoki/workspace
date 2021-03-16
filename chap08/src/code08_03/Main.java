package code08_03;

public class Main {
	public static void main(String[] args) {
		Car c = new Car();
		c.fuel = 1000;
		c.speed = 10;
		c.accelarate(20);
		c.run(1);

		c.stop();
		c.showMeter();
}
}