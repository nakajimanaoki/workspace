package rensyuu05_05;

public class Main {
	public static void main (String[] args) {
		double Triangle = calcTriangleArea(10.0, 5.0);
		System.out.println("三角形の底辺の長さが10.0、高さが5.0の場合、面積は" + Triangle);

		double Circle = calcCircleArea(6.0);
		System.out.println("円の半径が6.0の場合、面積は" + Circle);
	}
	public static double calcTriangleArea(double bottom, double height) {
		double ans = bottom * height /2;
		return ans;
	}
	public static double calcCircleArea(double radius) {
		double ans = radius * radius  * 3.14;
		return ans;
	}
}

/*returnは呼び出したコードに返っていく→5行目のcalcTriangleArea*/
/*format(メソッド)小数点以下を整形する*/