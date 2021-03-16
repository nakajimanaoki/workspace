package code05_08;

public class Main {
//	public static int add(int x, int y) {
//		return x + y;
//	}
//	public static double add(double x, double y) {
//		return x + y;
//	}
//	public static String add(String x, String y) {
//		return x + y;
//	}
//	public static void main(String[] args) {
//		System.out.println(add(10, 20));
//		System.out.println(add(3.5, 2.7));
//		System.out.println(add("Hello", "World"));
//	}


//		public static int add(int x, int y) {
//			return x + y;
//		}
//		public static int add(int x, int y, int z) {
//			return x + y + z;
//		}
//		public static void main(String[] args) {
//			System.out.println("10 + 20 = " + add(10, 20));
//			System.out.println("10 + 20 + 30 = " + add(10, 20, 30));

			public static double add(double x, int y) {
				return x + y;
			}
			public static String add(int x, String y) {
				return x + y;
			}
			public static void main(String[] args) {
				System.out.println("1.0 + 2 = " + add(1, 2));
				System.out.println("10 + 20 + 30 = " + add(3, "String"));

}
}