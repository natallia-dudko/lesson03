package lt.lhu.unit02.main;

/*
 * Напишите программу 
 * нахождения гипотенузы и площади прямоугольного треугольника по двум катетам.
 * 
 */

public class Task02 {
	
	public static void main(String[] args) {
		
		double x;
		double y;

		double hyp;
		double sqr;
		

		x = 6;
		y = 11;

		hyp = Math.sqrt(x*x + y*y);
		sqr = (x * y)/2;
		
		System.out.println("hypotenuse = " + hyp);
		System.out.println("square = "+sqr);

	}

}
