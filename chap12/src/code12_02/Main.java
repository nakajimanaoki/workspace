package code12_02;

public class Main {

	public static void main(String[] args) {
		Y[] alp = new Y[2];
		alp[0] = new A();
		alp[1] = new B();
		for (Y y : alp) {
			y.b();
		}
	}

}
