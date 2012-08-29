import java.util.Scanner;

class youtube {
	public static void main(String args[]){
		// System.out.println("What is the radius?");
		// Scanner radiusIn = new Scanner(System.in);
		// double radius = radiusIn.nextDouble();
		// System.out.println(radius);
		// double circleRadius = calculateArea(radius);
		// System.out.print("The area of the circle is");
		// System.out.print(circleRadius);

		double pi = calculatePi(10);
		System.out.println("Pi to accuracy of 10 is: ");
		System.out.print(pi);
		
		pi = calculatePi(50);
		System.out.println("Pi to accuracy of 50 is: ");
		System.out.print(pi);

		pi = calculatePi(100);
		System.out.println("Pi to accuracy of 100 is: ");
		System.out.print(pi);

		pi = calculatePi(1000);
		System.out.println("Pi to accuracy of 1000 is: ");
		System.out.print(pi);

		pi = calculatePi(10000);
		System.out.println("Pi to accuracy of 10000 is: ");
		System.out.print(pi);

		pi = calculatePi(100000);
		System.out.println("Pi to accuracy of 100000 is: ");
		System.out.print(pi);

		pi = calculatePi(100000000);
		System.out.println("Pi to accuracy of 100000000 is: ");
		System.out.print(pi);
		

	}

	public static double calculateArea(double radius) {
		double pi = 3.14;

		double area = pi * radius * radius;
		return area;

	}

	public static double calculatePi(int accuracy) {
		double i;
		double addValue = 0;
		double pi = 0;

		for (i = 0; i < accuracy; i++){
			addValue = 4 / (1 + (2 * i));
			if (i % 2 == 0) {
				pi += addValue;
			} else { 
				pi -= addValue;
			}
		}

		return pi;


	}
}