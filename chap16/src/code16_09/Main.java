package code16_09;
import java.util.*;


public class Main {
	public static void main(String[] args) {
		Hero h1 = new Hero("さいとう");
		Hero h2 = new Hero("すずき");
		List<Hero> heroes = new ArrayList<Hero>();
		heroes.add(h1);
		heroes.add(h2);
		for (Hero h : heroes) {
			System.out.println(h.getName());
		}
	}

}
