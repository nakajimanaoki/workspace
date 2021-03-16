package code01_01;

public class Main {

	public static void main(String[] args) {;
		Animal[] animals = new Animal[3];

		animals[0] = new Cat();
		animals[1] = new Dog();
		animals[2] = new Tori();


		for (Animal a : animals) {
			a.naku();
		}
	}

}
