package lt.lhu.unit02.main;

public class Task03 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;

		a = 3;
		b = 5;
		c = 9;

		double result;

		result = Math.pow(a, 2) - Math.pow(b - c, 2) + Math.log(b * b + 1);
		System.out.println("value = " + result);

	}

}
