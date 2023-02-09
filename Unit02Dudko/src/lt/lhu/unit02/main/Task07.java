package lt.lhu.unit02.main;

/*
 * Даны три действительных числа. 
 * Возвести в квадрат те из них, значения которых неотрицательны, и в 
 * четвертую степень — отрицательные.
 * 
 */

public class Task07 {

	public static void main(String[] args) {
		double a = 0;
		double b = 0;
		double c = 0;

		double new_a;
		double new_b;
		double new_c;

		a = 4;
		b = -2;
		c = -8;

		if (a >= 0) {
			new_a = a * a;
			System.out.println("Значение a в квадрате =" + new_a);
		} else {
			new_a = Math.pow(a, 4);
			System.out.println("Значение a в четвертой степени = " + new_a);
		}

		if (b >= 0) {
			new_b = b * b;
			System.out.println("Значение b в квадрате =" + new_b);
		} else {
			new_b = Math.pow(b, 4);
			System.out.println("Значение b в четвертой степени = " + new_b);
		}

		if (c >= 0) {
			new_c = c * c;
			System.out.println("Значение c в квадрате =" + new_c);
		} else {
			new_c = Math.pow(c, 4);
			System.out.println("Значение c в четвертой степени = " + new_c);
		}

	}

}
