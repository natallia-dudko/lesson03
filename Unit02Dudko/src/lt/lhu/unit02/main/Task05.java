package lt.lhu.unit02.main;

public class Task05 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;

		a = 2;
		b = 5;
		c = 9;

		double result;

		result = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + b;

		System.out.println("value = " + result);

	}
}
